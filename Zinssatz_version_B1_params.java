package Zinssatz;

import java.util.Scanner;

public class Zinssatz_version_B1_params {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//User Input
		
		double kapital = args[0];
		double zinssatz = args[1];
		int laufzeit = args[2];
		int periods = args[3];

		//result
		System.out.println("Am Ende der Laufzeit erhalten Sie: " + calcCompountInterest(kapital, zinssatz, laufzeit, periods) + "€.");

		}
	
	//Method to calculate result
	public static double calcCompountInterest(double kapital, double zinssatz, int laufzeit, int periods) {

		return (kapital * Math.pow((1 + zinssatz/100/periods), laufzeit*periods));		
	}

}
