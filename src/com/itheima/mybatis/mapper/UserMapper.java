package com.itheima.mybatis.mapper;

import com.itheima.mybatis.pojo.User;

public interface UserMapper {
	//Mapper  �ĸ�ԭ��
	//������  ==  user.xml id ��
	//����ֵ����==user.xml ��������
	//�������== �������
	//user.xml ==�ӿ�ȫ·��
	public User selectUserById(Integer id);

}
