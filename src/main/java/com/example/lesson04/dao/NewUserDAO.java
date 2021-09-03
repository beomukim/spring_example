package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;

import com.example.lesson04.model.NewUser;

public interface NewUserDAO {
	public void insertNewUser(
			@Param("name") String name, 
			@Param("yyyymmdd") String yyyymmdd, 
			@Param("introduce") String introduce, 
			@Param("email") String email);
	public NewUser selectLastNewUser();
}

