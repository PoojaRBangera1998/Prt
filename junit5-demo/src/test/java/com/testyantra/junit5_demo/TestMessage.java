package com.testyantra.junit5_demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * @Test
 * @DisplayName
 * @Order
 * @TestMethodOrder
 * @BeforeEach
 * @AfterEaach
 * @BeforeAll
 * @AfterAll
 * @Disabled
 * @RepeatedTest(5) //5 times it will run, you can give any number
 */
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Testing Message Class")
public class TestMessage {
	
	private String actual;
	private String expected;
	private Message message;
	private boolean condition;
	
	@RepeatedTest(value=5,name="-->>>{currentRepetition}/{totalRepetitions}")
	public void repeatedTest() {
		System.out.println("RepeatedTest()!");
	}
	@BeforeAll
	public static void startUp() {
		System.out.println("--->StartUp()!");
	}
	@AfterAll
	public static void cleanUp() {
		System.out.println("--->cleanUp()!");
	}
	@BeforeEach
	public void  setUpBeforeEachTestMethod() {
		message=new Message();
		actual=message.getMessage();
		expected="This is the actual message!";
		System.out.println("->setUpBeforeEachTestMethod()!");
	}
	
	@AfterEach
	public void  cleanUpAfterEachTestMethod() {
		message=null;
		actual=null;
		expected=null;
		System.out.println("->cleanUpAfterEachTestMethod()!");
	}
	
	
	
	@Test
	@DisplayName("Test Methods getMessage()!")
	//@Disabled
	@Order(33)
	public void testGetMessage() {
		Assertions.assertEquals(expected, actual);
		System.out.println("testGetMessage()!");
	}
	@Test
	@DisplayName("Test Methods updateMessage()!")
	@Order(1)
	public void testUpdateMessage() {
		condition=message.updateMessage();
		Assertions.assertTrue(condition);
		System.out.println("testUpdateMessage()!");
	}
	
	@Test
	@DisplayName("Test Methods deleteMessage()!")
	@Order(5)
	public void testDeleteMessage() {
		System.out.println("testDeleteMessage()!");
	}
}
