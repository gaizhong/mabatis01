package juit.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.Dao.UserDao;
import com.itheima.mybatis.Dao.UserDaoImpl;
import com.itheima.mybatis.pojo.User;

public class JuitDao {

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void before() throws IOException {
		String resource="sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//´´½¨ SqlsessionFactory
		
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}
	
	@Test
	public void funDao() {
		
		UserDao userDao =new UserDaoImpl(sqlSessionFactory);
		User user = userDao.selectById(1);
		System.out.println(user);
	}
}
