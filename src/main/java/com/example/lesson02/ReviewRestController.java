package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.ReviewBO;
import com.example.lesson02.model.Review;

@RestController
public class ReviewRestController {
	
	@Autowired
	private ReviewBO reviewbo; // dependency injection
	
	@RequestMapping("/lesson02/ex01")
	public List<Review> ex01() {
		List<Review> reviewList = reviewbo.getReviewList();
		return reviewList;
	}
}
