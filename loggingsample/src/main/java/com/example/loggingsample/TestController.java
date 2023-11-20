package com.example.loggingsample;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	Logger logger = LogManager.getLogger();
	
	@GetMapping("/test")
	public String testController() {
		logger.info("TestController called!");
		return "hello";
	}

}
