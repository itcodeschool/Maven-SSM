package com.itcodeschool.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcodeschool.ssm.domain.User;
import com.itcodeschool.ssm.mapper.UserMapper;
import com.itcodeschool.ssm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUser(int id) {
	
		return userMapper.findUser(id);
	}

	@Override
	public List<User> findUserList() {
		return userMapper.findUserList();
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public int deleteUser(int id) {
		return userMapper.deleteUser(id);
	}

	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}
}
