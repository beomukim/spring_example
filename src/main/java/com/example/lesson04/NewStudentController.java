package com.example.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson04")
@Controller
public class NewStudentController {
	@GetMapping("/ex02/1")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
}
