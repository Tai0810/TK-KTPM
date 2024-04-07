package com.example.product.service;

import org.springframework.stereotype.Service;

import com.example.product.entiry.Product;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class ProductService {
	@RateLimiter(name = "limiter")
	public Product getProduct() {
		return new Product(1, "Laptop");
	}
}
