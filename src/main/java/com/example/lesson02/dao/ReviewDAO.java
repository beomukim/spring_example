package com.example.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.model.Review;

@Repository
public interface ReviewDAO {
	public List<Review> selectReviewList();
}
