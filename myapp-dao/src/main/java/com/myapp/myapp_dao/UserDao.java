package com.myapp.myapp_dao;

import com.myapp.myapp_dao.entity.User;

public interface UserDao extends BaseDao<User> {

	public User findByIdWithTags(int userId);
	
}
