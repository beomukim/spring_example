package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.ReviewDAO;
import com.example.lesson02.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewdao;
	
	public List<Review> getReviewList() {
		return reviewdao.selectReviewList();
	}
}
