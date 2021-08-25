package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02 {
	
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// ViewResolver 클래스 작동 -> 리턴된 String이름의 view를 찾아서 화면 구성
		return "lesson01/ex02";
	}
}
