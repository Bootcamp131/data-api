package com.arrsoft131.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kelompok3")
public class kelompok3 {

	@RequestMapping
	@ResponseBody
	public String index(){
		return "hello world";
	}
}
