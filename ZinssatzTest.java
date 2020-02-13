package Zinssatz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZinssatzTest {

	@Test
	void test1() {
		double[] expected = {13500.0, 16439.56269143382, 17389.840629777667};
		assertArrayEquals(expected, Zinssatz.zinseszins(4000, 50, 3));
	}

	@Test
	void test2() {
		double[] expected = {13458.6833832413, 13488.501525493075 , 13495.217594528345};
		assertArrayEquals(expected, Zinssatz.zinseszins(10000, 2, 15));
	}

	@Test
	void test3() {
		double[] expected = {102658.06519482906, 102705.99763182702 , 102716.68485404263};
		assertArrayEquals(expected, Zinssatz.zinseszins(80000, 0.5, 50));
	}

}
