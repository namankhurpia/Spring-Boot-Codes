package com.namankhurpia.junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void sum() {
		//fail("Not yet implemented");
		MyMath mymath = new MyMath();
		int res = mymath.sum(new int[] {2,3,4});
		assertEquals(9,res);
		
	}
	
	@Test
	void sumwihothers() {
		//fail("Not yet implemented");
		MyMath mymath = new MyMath();
		int res = mymath.sum(new int[] {2});
		assertEquals(2,res);
		
	}

}
