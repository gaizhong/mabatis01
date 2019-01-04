package juit.dao.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.User;

public class DyMapper {

	@Test
	public void fun() throws IOException {
		//���غ����ļ�
				String resource="sqlMapConfig.xml";
				 InputStream inputStream = Resources.getResourceAsStream(resource);
				
				//���� SqlsessionFactory
				
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession sqlSession = sessionFactory.openSession();
				//sqlsession �����ɽӿڵ�ʵ��
				UserMapper usMapper = sqlSession.getMapper(UserMapper.class);
				User user = usMapper.selectUserById(10);
				System.out.println(user);

	}
}
