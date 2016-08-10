package com.myapp.myapp_service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myapp.bean.UserDTO;

public interface UserService {
	
	public Map<String, Object> getUserProfile(HttpServletRequest request);
	
	public Map<String, Object> updateUserProfile(UserDTO userDTO, HttpServletRequest request);

}
