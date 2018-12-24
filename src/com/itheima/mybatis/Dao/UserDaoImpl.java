package com.itheima.mybatis.Dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itheima.mybatis.pojo.User;

public class UserDaoImpl implements UserDao {

	//注入工厂
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}
	//通过用户id查询一个用户
	public User selectById(Integer id) {
		SqlSession session=sqlSessionFactory.openSession();
		User user = session.selectOne("user.selectUserById", id);
		return user;
	}
	
}
