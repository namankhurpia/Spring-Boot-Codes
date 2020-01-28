package com.namankhurpia.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
class SomeBusinessMockTest {

	@Test
	void testfindthegreatetstfromall() {
		
		DataService dataservicemock = mock(DataService.class);
		//dataservicemock.retrieveAllData();
		when(dataservicemock.retrieveAllData()).thenReturn(new int[] {24, 12,3});
		
		SomeBusinessImp business = new SomeBusinessImp(dataservicemock);
		int result = business.findthegreatestfromall();
		assertEquals(24,result);
	}
	
	@Test
	void testfindthegreatstoneval() {
		
		DataService dataservicemock = mock(DataService.class);
		//dataservicemock.retrieveAllData();
		when(dataservicemock.retrieveAllData()).thenReturn(new int[] {24});
		
		SomeBusinessImp business = new SomeBusinessImp(dataservicemock);
		int result = business.findthegreatestfromall();
		assertEquals(24,result);
	}

}



