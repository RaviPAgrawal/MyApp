package com.myapp.myapp_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.myapp_dao.entity.User;
import com.myapp.myapp_dao.entity.enums.UserStatusType;
import com.myapp.myapp_dao.util.CommonUtil;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	
	public UserDaoImpl() {
		super(User.class);
	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	QueryDao queryDao;
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public User findByIdWithTags(int userId) {
		List<User> userList = entityManager.createQuery("from " + User.class.getName()
				+ " where id = :userId AND status NOT IN (:status)", User.class)
				.setParameter("userId", userId)
				.setParameter("status", UserStatusType.DELETED).getResultList();
		if(CommonUtil.notNullAndEmpty(userList)) {
			return userList.get(0);
		}
		return null;
	}

	
}
