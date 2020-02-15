package Zinssatz;

import java.util.Scanner;

public class Zinssatz_version_B1_scanner {

	public static void main(String[] args) {

		//User Input
		Scanner scan = new Scanner(System.in);
		
		double kapital = userInputKapital(scan);
		double zinssatz = userInputZinssatz(scan);
		int laufzeit = userInputLaufzeit(scan);
		int periods = userInputPeriods(scan);
		
		scan.close();
		
		//result
		System.out.println("Am Ende der Laufzeit erhalten Sie: " + calcCompountInterest(kapital, zinssatz, laufzeit, periods) + "€.");

		}
	
	//1 user input of Kapital
	private static double userInputKapital(Scanner scan) {
		
		System.out.println("Bitte geben Sie Ihr Startkapital ein.");
		return scan.nextDouble();

	}
	
	//2 user input of Interest rate
	private static double userInputZinssatz(Scanner scan) {
		
		System.out.println("Bitte geben Sie den Zinssatz ein.");
		return scan.nextDouble();

	}
	
	//3 user input of Years
	private static int userInputLaufzeit(Scanner scan) {
		
		System.out.println("Bitte geben Sie die Laufzeit in Jahren ein.");
		return scan.nextInt();

	}
	
	//4 user input of interest periods per year
	private static int userInputPeriods(Scanner scan) {
		
		System.out.println("Bitte geben Sie die Anzahl der Zinsperioden je Jahr ein.");
		return scan.nextInt();
		
	}
		
	//5 Method to calculate result
	public static double calcCompountInterest(double kapital, double zinssatz, int laufzeit, int periods) {

		return (kapital * Math.pow((1 + zinssatz/100/periods), laufzeit*periods));
			
	}

}
