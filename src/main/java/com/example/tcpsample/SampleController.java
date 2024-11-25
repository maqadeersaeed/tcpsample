package com.example.tcpsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/test")
public class SampleController {

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		log.info("Service method called using @Slf4j");
		return User.builder().id(id).name("Muhammad").build();
	}
	
}
