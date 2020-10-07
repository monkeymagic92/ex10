package kr.itedu.ex10.test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	
		
	@Test
	void test() {
		int a1 = 10;
		int a2 = 20;
		
		Assert.assertEquals(a1 + a2, Calc.sum(a1, a2));
		
		int b1 = 5;
		int b2 = 8;
		
		Assert.assertEquals(b1 + b2, Calc.sum(b1, b2));
		
		int c1 = 5;
		int c2 = 10;
		
		Assert.assertEquals(c1 + c2, Calc.sum(c1, c2));
	}
	
	
}
