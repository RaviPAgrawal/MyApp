package com.myapp.myapp_service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.bean.UserDTO;
import com.myapp.myapp_dao.UserDao;
import com.myapp.myapp_dao.common.MyAppConstants;
import com.myapp.myapp_dao.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	

	public Map<String, Object> getUserProfile(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
			User user = userDao.findByIdWithTags(Integer.valueOf(request.getHeader("userId")));
			UserDTO userDTO = new UserDTO();
			result.put(MyAppConstants.STATUS, MyAppConstants.SUCCESS);
			result.put(MyAppConstants.RESULT, userDTO);
		return result;
	}
	
	public Map<String, Object> updateUserProfile(UserDTO userDTO, HttpServletRequest request){
		Map<String, Object> result = new HashMap<String, Object>();
			User user = userDao.findById(userDTO.getUserId());
			user.setAbout(userDTO.getAbout());
			userDao.update(user);
			result.put(MyAppConstants.STATUS, MyAppConstants.SUCCESS);
			result.put(MyAppConstants.RESULT, userDTO);
		return result;
	}

	
}
