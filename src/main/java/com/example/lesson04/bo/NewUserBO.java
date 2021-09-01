package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.NewUserDAO;

@Service
public class NewUserBO {
	
	@Autowired
	NewUserDAO newuserdao;
	
	public void adduser(String name, String yyyymmdd, String introduce, String email) {
		newuserdao.insertNewUser(name, yyyymmdd, introduce, email);
	}
}
