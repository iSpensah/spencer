package bank;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String choice;
		System.out.println("Press s if Savingsaccount || l if LoanAccount");
		choice = in.next();
		
		if(choice.equals("s")) {
			Customer c = new Customer();
			System.out.println("Enter cid,cname,cphone,cAccount");
			int cid = in.nextInt();
			String cname = in.next();
			int cAccount = in.nextInt();
			c.storeData(cid, cname, cAccount);
			
			Address a = new Address();
			System.out.println("Enter street, state, country, pincode");
			String street = in.next();
			String state = in.next();
			String country = in.next();
			int pincode= in.nextInt();
			a.storeData(street, state, country, pincode);
			
			Account acct = new Account();
			System.out.println("Enter accid, accbalance, accpin");
			int accid = in.nextInt();
			int accbalance=in.nextInt();
			int accpin=in.nextInt();
			acct.storeData(accid,accbalance,accpin,a,c);
			
			SavingAccount  sa = new SavingAccount();
			System.out.println("Enter InterestReceived, OverDraft");
			int IR = in.nextInt();
			int OR = in.nextInt();
			sa.storeData(acct, a, IR, OR);
			sa.displayData();
		}
		
		else if(choice.equals("l")) {
			
			Customer c = new Customer();
			System.out.println("Enter cid,cname,cphone,cAccount");
			int cid = in.nextInt();
			String cname = in.next();
			int cAccount = in.nextInt();
			c.storeData(cid, cname, cAccount);
			
			Address a = new Address();
			System.out.println("Enter street, state, country, pincode");
			String street = in.next();
			String state = in.next();
			String country = in.next();
			int pincode= in.nextInt();
			a.storeData(street, state, country, pincode);
			
			Account acct = new Account();
			System.out.println("Enter accid, accbalance, accpin");
			int accid = in.nextInt();
			int accbalance=in.nextInt();
			int accpin=in.nextInt();
			acct.storeData(accid,accbalance,accpin,a,c);
			
			LoanAccount la = new LoanAccount();
			System.out.println("Enter PrincipalLoanAmount, MonthlyEmi, TotalLoanDuration, InterestApplied");
			int PA = in.nextInt();
			int ME = in.nextInt();
			int TD = in.nextInt();
			int IA = in.nextInt();
			la.storeData(acct, a, PA, ME, TD, IA);
			la.displayData();
		
			
		}
	}
}
