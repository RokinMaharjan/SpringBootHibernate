package com.rokin.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.rokin.bookstore.entity.User;
import com.rokin.bookstore.repository.UserRepository;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<User> getAll()
	{
		return (List<User>) userRepository.findAll();
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(
			@RequestParam("name") String name,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone,
			@RequestParam("email") String email,
			@RequestParam("username") String username,
			@RequestParam("password") String password
			)
	{
		User user = new User();
		
		user.setName(name);
		user.setAddress(address);
		user.setUsername(username);
		user.setPhone(phone);
		user.setPassword(password);
		user.setEmail(email);
		
		userRepository.save(user);
		return "home";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value="/authenticate")
	public String authenticate(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		User user = userRepository.findByUsername(username);
		if(user.getPassword().equalsIgnoreCase(password))
		{
			return "access";
		}
		return "home";
	}
	
}
