package com.jg.TestCases;

import org.testng.annotations.DataProvider;

public class DataproviderClass {

	 @DataProvider(name="credentialProvider")

     public static Object[][] getDataFromDataprovider(){

         return new Object[][] {

             { "jungleebond7", "matmalik" },           
         };
}
}
