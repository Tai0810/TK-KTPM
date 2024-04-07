package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.UserService;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService retryService;
	
	@GetMapping("/product")
	@Retry(name = "retryApi")
	@RateLimiter(name = "myRatelimiter")
	public String getproduct() {
		return retryService.getProducts();
	}
}
