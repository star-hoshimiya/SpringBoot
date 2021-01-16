package com.purvar.springboot.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping("login")
	public String login(HttpServletRequest request, Model model) {
		String loginName = request.getParameter("loginName");
		String pwd = request.getParameter("password");
		System.out.print(pwd);
		model.addAttribute("msg", "Hello " + loginName);
		return "hello";
	}
}
