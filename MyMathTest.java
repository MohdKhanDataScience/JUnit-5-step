package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math=new MyMath();

	@Test
	void calculateSum_ThreeMemberArray() {
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
		
		//Absence of failure is success
		//Test Condition or Assert
		
	}
	@Test
	void calculateSum_ZeroLengthArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
		
	}
	@Test
	void calculateSum_OneArray() {
		assertEquals(1, math.calculateSum(new int[] {1}));
	}
	

	@Test
	void Test() {
		int[] numbers= {1,2,3};
		int result=math.calculateSum(numbers);
		int expextedResult=6;
		assertEquals(expextedResult,result);
		//System.out.println(result);
	}
}
