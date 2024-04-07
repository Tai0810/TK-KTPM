package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;
	
	public String getProducts() {
		return restTemplate.getForObject("http://localhost:8080/products/", String.class);
	}
}
