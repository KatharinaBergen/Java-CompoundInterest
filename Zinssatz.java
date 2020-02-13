package Zinssatz;

import java.util.Scanner;

public class Zinssatz {
	
	//because the program is not in the default package, to run it via cmd you must enter cd PATH\bin --> java Zinssatz.Zinssatz

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		//save capital result considering yearly, quarterly and monthly interest in list
		double result[] = zinseszins(kapital, zinssatz, laufzeit);
		
		System.out.println(
						"bei jährlicher Verzinung: " + String.format("%.2f",result[0])
						+ " bei vierteljährlicher Verzinung: " + String.format("%.2f",result[1])
						+ " bei monatlicher Verzinung: " + String.format("%.2f",result[2]));	
	}
	
	//Method to calculate result: yearly, quarterly and monthly interest
	public static double[] zinseszins(double kapital, double zinssatz, int laufzeit) {
		double jährlicheVerzinsung = (kapital * Math.pow((1 + zinssatz/100), laufzeit)) ;
		double vierteljährlicheVerzinsung = (kapital * Math.pow((1 + zinssatz/100/4), laufzeit*4)) ;
		double monatlicheVerzinsung = (kapital * Math.pow((1 + zinssatz/100/12), laufzeit*12)) ;
		
		return new double[] {jährlicheVerzinsung, vierteljährlicheVerzinsung, monatlicheVerzinsung};
		}
	
	
		
}
