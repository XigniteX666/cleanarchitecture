package com.xignitex.cleanarchitecture.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import		io.restassured.matcher.RestAssuredMatchers.*;
import		org.hamcrest.Matchers.*;
import org.springframework.boot.web.server.LocalServerPort;

import javax.annotation.PostConstruct;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@LocalServerPort
	private int port;

	private String uri;


	@PostConstruct
	public void init() {
		uri = "http://localhost:" + port;
	}

	@Test
	public void whenRequestGet_thenOK(){
		given().when().get("http://localhost:8080/greeting").then().statusCode(200);
	}

}
