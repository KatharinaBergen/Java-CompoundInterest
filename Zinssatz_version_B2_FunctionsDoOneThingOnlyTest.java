package Zinssatz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Zinssatz_version_B2_FunctionsDoOneThingOnlyTest {

	
	
	@Test
	void test1() {
		assertEquals(0.2, Zinssatz_version_B2_FunctionsDoOneThingOnly.annualInterestRate(2));
	}
	
	@Test
	void test2() {
		assertEquals(1.2, Zinssatz_version_B2_FunctionsDoOneThingOnly.annualReturnRate(2));
	}
	
	@Test
	void test3() {
		assertEquals(0.6, Zinssatz_version_B2_FunctionsDoOneThingOnly.annualReturnRateByPeriods(2, 2));
	}
	
	@Test
	void test4() {
		assertEquals(20, Zinssatz_version_B2_FunctionsDoOneThingOnly.totalInterestPeriods(10, 2));
	}
	
	@Test
	void test5() {
		assertEquals(1.4171098670753049E-6, Zinssatz_version_B2_FunctionsDoOneThingOnly.compoundReturnRate(2, 10, 2));
	}
	
	@Test
	void test6() {
		assertEquals(4880.760159791868, Zinssatz_version_B2_FunctionsDoOneThingOnly.compoundReturn(4000, 2, 10, 2));
	}

}
