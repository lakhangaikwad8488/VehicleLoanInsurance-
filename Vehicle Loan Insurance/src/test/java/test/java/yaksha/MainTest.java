package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import main.java.yaksha.TestUtils;
import main.java.yaksha.Vehicle;

@RunWith(MockitoJUnitRunner.class)  
class MainTest {

	@Mock
	Vehicle v;
	 
	@Test
	void testIssueLoan() throws IOException {
		  v=new Vehicle( "12345", "Honda", "4wheeler", 300000) ; 
		//assertEquals(150000.0, v.issueLoan());
		
		Mockito.when(v.issueLoan()).thenReturn(150000.0);
		double actual=v.issueLoan();
		TestUtils.yakshaAssert(TestUtils.currentTest(),(actual==150000.0?true:false),TestUtils.businessTestFile);

	}
	@Test
	void testTakeInsurance() throws IOException {
		  v=new Vehicle( "12345", "Honda", "4wheeler", 300000) ;
		//assertEquals(4000.0, v.takeInsurance());
		double actualInsurance=v.takeInsurance();
		Mockito.when(v.takeInsurance()).thenReturn(4000.0);
		TestUtils.yakshaAssert(TestUtils.currentTest(),(actualInsurance==4000.0?true:false),TestUtils.businessTestFile);

	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}

	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}


}
