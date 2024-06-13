package data_provider;

import org.testng.annotations.DataProvider;

public class Data_Providers {
	
	@DataProvider(name="InvalidUserCredentials")
	
	public Object[][] userCredentialsData()
	{
		Object [][] data=new Object[3][2];
		data[0][0]="veena1@gmail.com";
		data[0][1]="veena@96";
		
		data[1][0]="veenababu@gmail.com";
		data[1][1]="veena@9";
		
		data[2][0]="veena1@gmail.com";
		data[2][1]="veena@9";
		
		return data;
	}

}
