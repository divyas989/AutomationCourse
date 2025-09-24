package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@Test
	public void sampleTest() {
		System.out.println("This is a testcase");
	}
	@BeforeMethod 
	public void beforeMethod() {				//It execute before the execution of @Test -Eg : browser load will given in before method and login is in @ test
		System.out.println("This is a before method");
	}

	@AfterMethod 
	public void afterMethod() {			//It executes after the @Test method eg:Browser close and Quit
		System.out.println("This is after method");
	}



	@BeforeClass
	public void beforeClass() {				
		System.out.println("This is a before Class ");
	}

	@AfterClass
	public void afterClass() {			
		System.out.println("This is after Class");
	}


	@BeforeTest
	public void beforeTest() {				//It execute before the execution of @beforeMethod
		System.out.println("This is a before Test ");
	}

	@AfterTest
	public void afterTest() {			//It executes after the @AfterMethod 
		System.out.println("This is after Test");
	}

	@BeforeSuite
	public void beforeSuit() {				
		System.out.println("This is Before Suite ");
	}

	@AfterSuite
	public void afterSuit() {			
		System.out.println("This is After Suite");
	}



}
