package Zinssatz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Zinssatz_version_B1Test {

	@Test
	void test1() {
		assertEquals(4880.760159791868, Zinssatz_version_B1_params.calcCompountInterest(4000, 2, 10, 2));
	}
	
	@Test
	void test2() {
		assertEquals(4880.760159791868, Zinssatz_version_B1_scanner.calcCompountInterest(4000, 2, 10, 2));
	}

}
