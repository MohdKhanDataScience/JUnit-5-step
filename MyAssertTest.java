package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos= Arrays.asList("Aws", "Azure", "Devops");

	@Test
	void test() {
		
		boolean test=todos.contains("Aws");
		boolean test2=todos.contains("Gcp");
		assertEquals(true,test);
		assertTrue(test);
		assertFalse(test2);
		assertEquals(3,todos.size());
		System.out.println(test2);
		
		assertArrayEquals(new int[] {1,2},new int [] {1,2});
	}

}
