package Zinssatz;

public class Zinssatz_version_B3_YearlyQuarterlyMonthly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			//annual return rate by periods 
			public static double annualInterestRateByPeriods(double zinssatz, int periods) {
				return annualInterestRate(zinssatz) / periods;
			}
			
				//annual return rate
			public static double annualReturnRate(double zinssatz, int periods) {
				return 1 + annualInterestRateByPeriods(zinssatz, periods);
			}
			
			//total number of interest periods
			public static double totalInterestPeriods(int laufzeit, int periods) {
				return laufzeit * periods;
			}
			
			//compound return rate
			public static double compoundReturnRate(double zinssatz, int laufzeit, int periods) {
				return  Math.pow(annualReturnRate(zinssatz, periods), totalInterestPeriods(laufzeit, periods));
			}
			
			//compound return
			public static double compoundReturn(double kapital, double zinssatz, int laufzeit, int periods) {
				return kapital * compoundReturnRate(zinssatz, laufzeit, periods);
			}	
			
			//compound return 1 annual payment
			public static double calcCompundInterestYearly(double kapital, double zinssatz, int laufzeit) {
				return compoundReturn(kapital, zinssatz, laufzeit, 1);
			}
			

			//compound return 4 annual payments
			public static double calcCompundInterestQuarterly(double kapital, double zinssatz, int laufzeit) {
				return compoundReturn(kapital, zinssatz, laufzeit, 4);
			}
			
			//compound return 12 annual payments
			public static double calcCompundInterestMonthly(double kapital, double zinssatz, int laufzeit) {
				return compoundReturn(kapital, zinssatz, laufzeit, 12);
			}

}
