package Zinssatz;


public class Zinssatz_version_B2_FunctionsDoOneThingOnly {

	public static void main(String[] args) {
		//User Input
		
		double kapital = args[0];
		double zinssatz = args[1];
		int laufzeit = args[2];
		int periods = args[3];
	
	
		//result
		System.out.println("Am Ende der Laufzeit erhalten Sie: " + compoundReturn(kapital, zinssatz, laufzeit, periods) + "€.");
		
	}
	

	//annual interest rate
	public static double annualInterestRate(double zinssatz) {
		return zinssatz/100;
	}
	
	//annual return rate
	public static double annualReturnRate(double zinssatz) {
		return 1 + annualInterestRate(zinssatz);
	}
	
	public static double annualReturnRateByPeriods(double zinssatz, int periods) {
		return annualReturnRate(zinssatz) / periods;
	}
	
	public static double totalInterestPeriods(int laufzeit, int periods) {
		return laufzeit * periods;
	}
	
	//compound return rate
	public static double compoundReturnRate(double zinssatz, int laufzeit, int periods) {
		return  Math.pow(annualReturnRateByPeriods(zinssatz, periods), totalInterestPeriods(laufzeit, periods));
	}
	
	//compound return
	public static double compoundReturn(double kapital, double zinssatz, int laufzeit, int periods) {
		return kapital * compoundReturnRate(zinssatz, laufzeit, periods);
	}

}

