package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;


public interface IUserDao {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User findUser(User user);
}