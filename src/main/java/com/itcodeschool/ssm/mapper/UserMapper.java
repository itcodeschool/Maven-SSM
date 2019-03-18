package com.itcodeschool.ssm.mapper;

import java.util.List;

import com.itcodeschool.ssm.domain.User;

public interface UserMapper {

	User findUser(int id);

	List<User> findUserList();

	int updateUser(User user);

	int deleteUser(int id);

	int addUser(User user);
}
