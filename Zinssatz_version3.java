package Zinssatz;

import java.util.ArrayList;
import java.util.Scanner;

public class Zinssatz_version3 {
	
	//because the program is not in the default package, to run it via cmd you must enter cd PATH\bin --> java Zinssatz.Zinssatz_version2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//user input START
		
		//Define Scanner to capture Attributes
		Scanner scan = new Scanner(System.in);
		
		//Ask of user to define innitial kapital
		System.out.println("Bitte geben Sie das Startkapital ein.");
		double kapital = scan.nextDouble();
		
		//Ask of user to define interest rate
		System.out.println("Bitte geben Sie den Zinssatz ein.");
		double zinssatz = scan.nextDouble();
		
		//Ask of user to define period in years
		System.out.println("Bitte geben Sie die Laufzeit in Jahren ein.");
		int laufzeit = scan.nextInt();

		//user input END
		
		
		//output
		
		double result = calcCompundInterest1PaymentPerYear(kapital, zinssatz, laufzeit);
		System.out.println("Ihr Kapital wird innerhalb von " + laufzeit + " Jahr(en) auf "+ String.format("%.2f", result) + "€ angewachsen sein.");
			

	}
	
	//Method to calculate result
	public static double calcCompundInterest(double kapital, double zinssatz, int laufzeit, int p) {

		return (kapital * Math.pow((1 + zinssatz/100/p), laufzeit*p));
		
	}
	
	//1-interest payment per year
	public static double calcCompundInterest1PaymentPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 1);

	}
	
	//2-interest payments per year
	public static double calcCompundInterest2PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 2);

	}
	
	//3-interest payments per year
	public static double calcCompundInterest3PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 3);

	}
	
	
	//4-interest payments per year
	public static double calcCompundInterest4PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 4);

	}
	
	
	//5-interest payments per year
	public static double calcCompundInterest5PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 5);

	}
	
	
	//6-interest payments per year
	public static double calcCompundInterest6PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 6);

	}
	
	
	//7-interest payments per year
	public static double calcCompundInterest7PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 7);

	}
	
	
	//8-interest payments per year
	public static double calcCompundInterest8PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 8);

	}
	
	
	//9-interest payments per year
	public static double calcCompundInterest9PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 9);

	}
	
	
	//10-interest payments per year
	public static double calcCompundInterest10PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 10);

	}
	
	
	//11-interest payments per year
	public static double calcCompundInterest11PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 11);

	}
	
	
	//12-interest payments per year
	public static double calcCompundInterest12PaymentsPerYear (double kapital, double zinssatz, int laufzeit) {

	    return calcCompundInterest (kapital, zinssatz, laufzeit, 12);

	}
	
}