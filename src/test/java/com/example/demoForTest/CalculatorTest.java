package com.example.demoForTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

	@BeforeAll
	public static void showBegin() {
		System.out.println("test begin");
	}
	
	@AfterAll
	public static void showend() {
		System.out.println("test end");
	}
	@AfterEach
	public void showtest() {
		System.out.println("test again");
	}
	
	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		assertEquals(7, cal.add(3, 4));
		assertNotNull(cal.add(3, 4));
	}

	@Test
	public void testDivide() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.divide(12, 4));
		assertNotNull(cal.divide(12, 4));
		assertThrows(ArithmeticException.class, 
				     () ->{
			             cal.divide(12, 0);
		             }
				     ,"ArithmeticException");
	}

}
