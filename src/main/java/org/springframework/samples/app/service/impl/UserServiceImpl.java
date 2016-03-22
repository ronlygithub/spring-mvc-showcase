package org.springframework.samples.app.service.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.samples.app.dao.UserMapper;
import org.springframework.samples.app.pojo.User;
import org.springframework.samples.app.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;
	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	

	

}
