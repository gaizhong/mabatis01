package com.itheima.mybatis.Dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itheima.mybatis.pojo.User;

public class UserDaoImpl implements UserDao {

	//ע�빤��
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}
	//ͨ���û�id��ѯһ���û�
	public User selectById(Integer id) {
		SqlSession session=sqlSessionFactory.openSession();
		User user = session.selectOne("user.selectUserById", id);
		return user;
	}
	
}
