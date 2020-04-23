package Pageobjects;

import org.testng.annotations.DataProvider;

public class TestData {
	
	
	

	        @DataProvider(name="SearchProvider")
	        public static Object[][] getDataFromDataprovider(){
	            return new Object[][] {
	                { "Guru99", "India" },
	                { "Krishna", "UK" },
	                { "Bhupesh", "USA" }
	            };  
	}
	        }

	 
	 
	
	   



