package Zinssatz;

public class Zinssatz_version_B3_YearlyQuarterlyMonthly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//User Input
		
				double startCapital = args[0];
				double interestRate = args[1];
				int growthYears = args[2];
				int interestPeriodsPerYear = args[3];
			
			}
			

			//annual interest rate
			public static double calcInterestRate(double interestRate) {
				return interestRate/100;
			}
			
			//annual return rate by periods 
			public static double calcInterestRateByPeriods(double interestRate, int interestPeriodsPerYear) {
				return calcInterestRate(interestRate) / interestPeriodsPerYear;
			}
			
				//annual return rate
			public static double calcReturnRate(double interestRate, int interestPeriodsPerYear) {
				return 1 + calcInterestRateByPeriods(interestRate, interestPeriodsPerYear);
			}
			
			//total number of interest periods
			public static double calcInterestPeriods(int growthYears, int interestPeriodsPerYear) {
				return growthYears * interestPeriodsPerYear;
			}
			
			//compound return rate
			public static double calcCompoundReturnRate(double interestRate, int growthYears, int interestPeriodsPerYear) {
				return  Math.pow(calcReturnRate(interestRate, interestPeriodsPerYear), calcInterestPeriods(growthYears, interestPeriodsPerYear));
			}
			
			//compound return
			public static double calcCompoundReturn(double startCapital, double interestRate, int growthYears, int interestPeriodsPerYear) {
				return startCapital * calcCompoundReturnRate(interestRate, growthYears, interestPeriodsPerYear);
			}	
			
			//compound return 1 annual payment
			public static double calcCompundInterestYearly(double startCapital, double interestRate, int growthYears) {
				return calcCompoundReturn(startCapital, interestRate, growthYears, 1);
			}
			

			//compound return 4 annual payments
			public static double calcCompundInterestQuarterly(double startCapital, double interestRate, int growthYears) {
				return calcCompoundReturn(startCapital, interestRate, growthYears, 4);
			}
			
			//compound return 12 annual payments
			public static double calcCompundInterestMonthly(double startCapital, double interestRate, int growthYears) {
				return calcCompoundReturn(startCapital, interestRate, growthYears, 12);
			}

}
