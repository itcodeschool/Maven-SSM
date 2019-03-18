package com.itcodeschool.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itcodeschool.ssm.domain.User;
import com.itcodeschool.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private IUserService userService;

	@RequestMapping("/findUser")
	public String findUser(Integer id,Model model) {
		User user = userService.findUser(id);
		List<User> list = new ArrayList<User>();
		list.add(user);
			
		model.addAttribute("list", list);
		return "/UserList";
	}
	
	@RequestMapping("/findUserList")
	public String findUserList(Model model) {
		List<User> list = userService.findUserList();
		model.addAttribute("list", list);
		return "/UserList";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		userService.updateUser(user);
		return "redirect:/user/findUserList.do";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		userService.addUser(user);
		return "redirect:/user/findUserList.do";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(Integer id) {
		userService.deleteUser(id);
		return "redirect:/user/findUserList.do";
	}
}
