package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.Baseclass;
import com.itlearn.pages.LoginPage;



public class LoginTestCase extends Baseclass {
	
	@Test
	void verifyLogin() {
		
	LoginPage lp=new LoginPage(driver);
	String username ="Demo12";
	String password ="Test123456$";
	lp.loginPortal(username, password);
}
}
