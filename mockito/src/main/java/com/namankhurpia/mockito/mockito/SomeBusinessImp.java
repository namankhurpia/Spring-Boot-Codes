package com.namankhurpia.mockito.mockito;

public class SomeBusinessImp {
	private DataService dataservice;
	
	public SomeBusinessImp(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}



	int findthegreatestfromall()
	{
		int [] data = dataservice.retrieveAllData();
		int gr = Integer.MIN_VALUE;
		for(int v : data)
		{
			if(v>gr)
			{
				gr = v;
			}
		}
		return gr;
	}

}
