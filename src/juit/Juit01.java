package juit;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.itheima.mybatis.pojo.User;

public class Juit01 {

	@Test
	public void fun() throws IOException {
		//加载核心文件
		String resource="sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//创建 SqlsessionFactory
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		System.out.println(sqlSession);
		
		User user = (User)sqlSession.selectOne("user.selectUserById", "10");
		   System.out.println(user);
	
	}
	
	
	@Test
	public void funByName() throws IOException {
		//加载核心文件
		String resource="sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//创建 SqlsessionFactory
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		
		List<User> list = sqlSession.selectList("user.selectUserByName", "张");
		   System.out.println(list.size());
	
	}
	
	@Test
	public void funInsert() throws IOException {
		//加载核心文件
		String resource="sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//创建 SqlsessionFactory
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		User user=new User();
		user.setUsername("餮");
		user.setSex("2");
		int insert = sqlSession.insert("user.insertUser", user);
		sqlSession.commit();
		System.out.println(user.getId());
	
	}
	
	@Test
	public void funUpdate() throws IOException {
		//加载核心文件
		String resource="sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//创建 SqlsessionFactory
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		User user=new User();
		user.setId(66);
		user.setUsername("无意");
		user.setSex("女");
		int update = sqlSession.update("user.updateUser", user);
		sqlSession.commit();
		System.out.println(user);
	}
}
