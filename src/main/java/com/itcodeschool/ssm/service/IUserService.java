package com.itcodeschool.ssm.service;
import java.util.List;

import com.itcodeschool.ssm.domain.User;

public interface IUserService {
	
	/**
	 * 查询所有用户
	 * @return List<User>
	 */
	public List<User> findUserList();
	
	/**
	 * 根据id查询对应的用户
	 * @param id
	 * @return User
	 */
	public User findUser(int id);
	
	/**
	 * 根据id删除用户
	 * @param id
	 * @return 1、成功  0、失败
	 */
	public int deleteUser(int id);
	
	/**
	 * 根据User信息修改用户
	 * @param User
	 * @return 1、成功  0、失败
	 */
	public int updateUser(User user);
	
	/**
	 * 保存用户
	 * @param user
	 * @return 1、成功  0、失败
	 */
	public int addUser(User user);

}
