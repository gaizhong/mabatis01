package com.itheima.mybatis.mapper;

import com.itheima.mybatis.pojo.User;

public interface UserMapper {
	//Mapper  四个原则
	//方法名  ==  user.xml id 名
	//返回值类型==user.xml 返回类型
	//入参类型== 入参类型
	//user.xml ==接口全路径
	public User selectUserById(Integer id);

}
