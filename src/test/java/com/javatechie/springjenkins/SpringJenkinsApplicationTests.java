package com.javatechie.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("ApplicationTest starting......");
		assertEquals(true,true);
	}

}
