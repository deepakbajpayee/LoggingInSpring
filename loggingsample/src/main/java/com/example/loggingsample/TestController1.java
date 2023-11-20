package com.example.loggingsample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {
	
	Logger logger = LoggerFactory.getLogger(this.getClass()) ;
	
	@GetMapping("/test")
	public String testController() {
		logger.info("TestController called!");
		return "hello";
	}

}
