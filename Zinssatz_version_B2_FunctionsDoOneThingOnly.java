package Zinssatz;


public class Zinssatz_version_B2_FunctionsDoOneThingOnly {

	public static void main(String[] args) {
		//User Input
		
		double kapital = args[0];
		double zinssatz = args[1];
		int laufzeit = args[2];
		int periods = args[3];
	
	}
	

	//annual interest rate
	public static double annualInterestRate(double zinssatz) {
		return zinssatz/100;
	}
	
	//annual return rate
	public static double annualReturnRate(double zinssatz) {
		return 1 + annualInterestRate(zinssatz);
	}
	
	//annual return rate by periods 
	public static double annualReturnRateByPeriods(double zinssatz, int periods) {
		return annualReturnRate(zinssatz) / periods;
	}
	
	//total number of interest periods
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
	
	//compound return 1 annual payment
	public static double compoundReturn_one_annualInterestPayment(double kapital, double zinssatz, int laufzeit) {
		return kapital * compoundReturnRate(zinssatz, laufzeit, 1);
	}
	
	//compound return 2 annual payments
	public static double compoundReturn_two_annualInterestPayments(double kapital, double zinssatz, int laufzeit) {
		return kapital * compoundReturnRate(zinssatz, laufzeit, 2);
	}

	//compound return 4 annual payments
	public static double compoundReturn_four_annualInterestPayments(double kapital, double zinssatz, int laufzeit) {
		return kapital * compoundReturnRate(zinssatz, laufzeit, 4);
	}
	
	//compound return 6 annual payments
	public static double compoundReturn_six_annualInterestPayments(double kapital, double zinssatz, int laufzeit) {
		return kapital * compoundReturnRate(zinssatz, laufzeit, 6);
	}

}

