package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repository.FeedbackRepository;

public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackRepository Feedbackrepo;
}
