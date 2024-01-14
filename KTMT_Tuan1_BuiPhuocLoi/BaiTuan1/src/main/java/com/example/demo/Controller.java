package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Tuan1")
public class Controller {
	@GetMapping(name="/Tuan1")
	public String Api() {
		return "id : 001,Mssv: 20041631,FullName : Tran Nam,dia chi : Ho Chi Minh,Quequan : Bien Hoa}]";
	}
}
