package com.surendar.springjenkins;

import org.slf4j.Logger;
// import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	// Logger logger = org.apache.logging.log4j.LogManager.getLogger(SpringJenkinsApplication.class);
	public static void main(String[] args) {
		logger.info("Starting Spring");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		System.out.println("Spring started from the main class for testing");
	}

}
