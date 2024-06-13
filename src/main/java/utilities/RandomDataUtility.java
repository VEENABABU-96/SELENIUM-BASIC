package utilities;

import com.github.javafaker.Faker;

public class RandomDataUtility {
	
	static Faker faker;
	
	public static String getFirstName()
	{
		faker=new Faker(); //reference for faker class
		String first_name=faker.name().firstName(); //get first name
		return first_name;
				
	}

	public static String getLastName()
	{
		faker=new Faker();
		String last_name=faker.name().lastName();
		return last_name;
	}
}
