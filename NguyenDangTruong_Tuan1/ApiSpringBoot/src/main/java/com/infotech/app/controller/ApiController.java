package com.infotech.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping(value="/NguyenDangTruong")
	public String Api() {
		return "id : 001,Mssv: 20062481,FullName : Nguyen Dang Truong,dia chi : Ho Chi Minh,Quequan : Ca Mau}]";
	}
}
