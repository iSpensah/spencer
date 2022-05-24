package bank;

public class LoanAccount extends Account{
	
	int PrincipalLoanAmount, MonthlyEmi, TotalLoanDuration, InterestApplied;
	
	public void storeData(Account acct, Address add, int PA, int ME, int TD, int IA) {
		super.storeData(acct.accid, acct.accbalance, acct.accpin, acct.a, acct.c);
		this.PrincipalLoanAmount = PA;
		this.MonthlyEmi=ME;
		this.TotalLoanDuration = TD;
		this.InterestApplied = IA;
	}
	
	public void displayData() {
		super.displayData();
		System.out.println("PrinLA: "+PrincipalLoanAmount +" MEmi: "+ MonthlyEmi +" TtlLDur: "+ TotalLoanDuration +" IntApp: "+ InterestApplied);
	}

}
