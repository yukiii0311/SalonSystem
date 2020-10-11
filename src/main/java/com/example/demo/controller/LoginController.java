package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.entity.Login;
import com.example.demo.domain.mapper.LoginMapper;

@Controller
public class LoginController {

	@Autowired
	LoginMapper loginMapper;

//	=========
//	login
//	=========

//	== get ==
//	ログイン画面のGETコントローラー
	@GetMapping("/login")
	public String getLogin(Model model) {
		List<Login> list = loginMapper.selectAll();
		model.addAttribute("login",list);

		return "login";
	}

//	== post ==
//	ログイン画面のPOSTコントローラー
	@PostMapping("/login")
	public String postLogin(Model model) {

		return "login";
	}

}
