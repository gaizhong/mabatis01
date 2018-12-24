package com.itheima.mybatis.Dao;

import com.itheima.mybatis.pojo.User;

public interface UserDao {

	public User selectById(Integer id);
}
