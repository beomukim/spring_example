package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.NewUserBO;
import com.example.lesson04.model.NewUser;

@RequestMapping("/lesson04")
@Controller
public class NewUserController {
	
	// 요청 URL : http://localhost/lesson04/ex01/1
	@RequestMapping(method = RequestMethod.GET, path = "/ex01/1")
	public String ex01_1() {
		return "lesson04/addUser";
	}
	@Autowired
	private NewUserBO newuserbo;
	
	@PostMapping("ex01/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value = "introduce", required = false) String introduce,
			@RequestParam("email") String email			
			) {
		// DB Insert
		newuserbo.adduser(name, yyyymmdd, introduce, email);
		
		return "lesson04/afterAddUser";	
		
	}
	
	@GetMapping("/ex01/2")
	public String getUserView(Model model) {
		NewUser user = newuserbo.getLastUser();
		model.addAttribute("user", user);
		model.addAttribute("title", "회원정보");
		
		return "lesson04/lastUser";
	}
}
