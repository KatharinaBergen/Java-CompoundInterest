package Zinssatz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Zinssatz_version3Test {

	//Method to calculate result
	@Test
	void test0() {
	
		assertEquals(4880.760159791868, Zinssatz_version3.calcCompundInterest(4000, 2, 10, 2));
		
	}
	
	//1-interest payment per year
	@Test
	void test1() {
	
		assertEquals(4875.97767997903, Zinssatz_version3.calcCompundInterest1PaymentPerYear(4000, 2, 10));
		
	}
	
	//2-interest payment per year
	@Test
	void test2() {
	
		assertEquals(4880.760159791868, Zinssatz_version3.calcCompundInterest2PaymentsPerYear(4000, 2, 10));
		
	}
	
	//3-interest payment per year
	@Test
	void test3() {
	
		assertEquals(4882.369438379861, Zinssatz_version3.calcCompundInterest3PaymentsPerYear(4000, 2, 10));
		
	}
	
	
	//4-interest payment per year
	@Test
	void test4() {
	
		assertEquals(4883.176945947175, Zinssatz_version3.calcCompundInterest4PaymentsPerYear(4000, 2, 10));
		
	}
	
	//5-interest payment per year
	@Test
	void test5() {
	
		assertEquals(4883.662372683623, Zinssatz_version3.calcCompundInterest5PaymentsPerYear(4000, 2, 10));
		
	}
	
	//6-interest payment per year
	@Test
	void test6() {
	
		assertEquals(4883.986375768486, Zinssatz_version3.calcCompundInterest6PaymentsPerYear(4000, 2, 10));
		
	}
	
	//7-interest payment per year
	@Test
	void test7() {
	
		assertEquals(4884.217995562134, Zinssatz_version3.calcCompundInterest7PaymentsPerYear(4000, 2, 10));
		
	}
	
	//8-interest payment per year
	@Test
	void test8() {
	
		assertEquals(4884.39181389964, Zinssatz_version3.calcCompundInterest8PaymentsPerYear(4000, 2, 10));
		
	}
	
	//9-interest payment per year
	@Test
	void test9() {
	
		assertEquals(4884.527067322608, Zinssatz_version3.calcCompundInterest9PaymentsPerYear(4000, 2, 10));
		
	}
	
	//10-interest payment per year
	@Test
	void test10() {
	
		assertEquals(4884.635308758368, Zinssatz_version3.calcCompundInterest10PaymentsPerYear(4000, 2, 10));
		
	}
	
	//11-interest payment per year
	@Test
	void test11() {
	
		assertEquals(4884.723895531808, Zinssatz_version3.calcCompundInterest11PaymentsPerYear(4000, 2, 10));
		
	}
	
	//12-interest payment per year
	@Test
	void test12() {
	
		assertEquals(4884.797735450056, Zinssatz_version3.calcCompundInterest12PaymentsPerYear(4000, 2, 10));
		
	}
	
	
}
