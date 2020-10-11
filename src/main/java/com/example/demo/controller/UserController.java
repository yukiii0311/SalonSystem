package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {


//	=========
//	User
//	=========

//	== get ==
//	ログイン画面のGETコントローラー
	@GetMapping("/user/new")
	public String getUser(){

		// user/new.htmlに画面遷移
		return "user/new";
	}

//	== post ==
//	ログイン画面のPOSTコントローラー
	@PostMapping("/user/new")
	public String postUser(
			@RequestParam("family_name")String str1,
			@RequestParam("first_name")String str2,
			@RequestParam("tel")String str3,
			@RequestParam("memo")String str4,
			Model model) {

		model.addAttribute("family_name",str1);
		model.addAttribute("first_name",str2);
		model.addAttribute("tel",str3);
		model.addAttribute("memo",str4);


		return "user/check";
	}

}
