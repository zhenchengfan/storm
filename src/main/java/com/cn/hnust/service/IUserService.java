package com.cn.hnust.service;

import com.cn.hnust.pojo.User;

public interface IUserService {  
    public User getUserById(String userId);

	public User findUser(User user);  
} 
