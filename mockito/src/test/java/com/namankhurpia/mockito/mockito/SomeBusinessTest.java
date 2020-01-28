package com.namankhurpia.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void testfindthegreatetstfromall() {
		SomeBusinessImp business = new SomeBusinessImp(new DataServiceStub());
		int result = business.findthegreatestfromall();
		assertEquals(60,result);
	}

}

class DataServiceStub implements DataService
{

	@Override
	public int[] retrieveAllData() {
		return new int[] {24,60,20};
	}
	
}
