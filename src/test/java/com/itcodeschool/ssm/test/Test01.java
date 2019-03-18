package com.itcodeschool.ssm.test;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itcodeschool.ssm.domain.User;
import com.itcodeschool.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:application-context.xml"})
public class Test01 {
	
	@Autowired
	private IUserService userService;

	/**
	 * 测试查询所有用户
	 */
	@Test
	public void run01() {
		List<User> list = userService.findUserList();
		System.out.println(list);
	}
	
	/**
	 * 测试查询某一个用户
	 */
	@Test
	public void run02() {
		User user = userService.findUser(3);
		System.out.println(user);
	}
	
	/**
	 * 测试增加一个用户
	 */
	@Test
	public void run03() {
		User user = new User();
		user.setName("wangwu");
		user.setAge(19);
		user.setSex(0);
		user.setAddress("北京");
		int flag = userService.addUser(user);
		System.out.println(flag);
	}
	
	/**
	 * 测试修改用户
	 */
	@Test
	public void run04() {
		User user = new User();
		user.setId(3);
		user.setName("wangwu11111");
		user.setAge(10);
		user.setSex(0);
		user.setAddress("北京111");
		int flag = userService.updateUser(user);
		System.out.println(flag);
	}
	
	/**
	 * 测试删除用户
	 */
	@Test
	public void run05() {
		int flag = userService.deleteUser(4);
		System.out.println(flag);
	}
}