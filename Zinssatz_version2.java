package Zinssatz;

import java.util.ArrayList;
import java.util.Scanner;

public class Zinssatz_version2 {
	
	//because the program is not in the default package, to run it via cmd you must enter cd PATH\bin --> java Zinssatz.Zinssatz_version2

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
	
		
		
		//Interest-Period-section START
		
		//capture the interest-periods per year in an array
		ArrayList<Integer> periods = new ArrayList<Integer>();
		periods.add(1);
		periods.add(4);
		periods.add(12);
		
		//Ask of user to define further interest-periods per year
		System.out.println("Bitte geben Sie ein, wieviele weitere Unterjahreverzinsungen Sie berechnen möchten. \n"
				+ "Bedenken Sie hierbei bitte, dass die jährliche, vierteljährliche und monatliche Verzinsung automatisch berechnet werden.");
		int anzahl = scan.nextInt();
		
		//Ask of user to add the periods as per the number of periods he has previously defined and add these to the array
		for (int i = 1; i <= anzahl; i++) {
			System.out.println("Bitte geben Sie jetzt die Anzahl der gewünschen Zinsperioden je Jahr ein.");
			int perioden = scan.nextInt();
			periods.add(perioden);
			}
			
		//Interest-Period-Section END
		
		

		
		//save capital result considering yearly, quarterly and monthly interest in list
		ArrayList<Double> result = zinseszins(kapital, zinssatz, laufzeit, periods);
		
		
		
		System.out.println(" \n\nIndividuell definierte Zeiträume: ");
		for (int i = 3; i < periods.size(); i++) {
			System.out.println(" bei " + periods.get(i) + " Zinsperioden je Jahr: " + result.get(i));
		}
						
		System.out.println("\n\n Standard-Zeiträume:\n bei jährlicher Verzinung: " + String.format("%.2f",result.get(0))
						+ "\n bei vierteljährlicher Verzinung: " + String.format("%.2f",result.get(1))
						+ "\n bei monatlicher Verzinung: " + String.format("%.2f",result.get(2)));	
	}
	
	//Method to calculate result: yearly, quarterly and monthly interest + periods defined by user
	public static ArrayList<Double> zinseszins(double kapital, double zinssatz, int laufzeit, ArrayList<Integer> periods) {
		ArrayList<Double> result = new ArrayList<Double>();
		for(int p : periods) {
			double verzinsung = (kapital * Math.pow((1 + zinssatz/100/p), laufzeit*p));
			result.add(verzinsung);
		}
		
		return result;
		}
		
}
