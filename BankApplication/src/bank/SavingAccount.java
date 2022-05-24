package bank;

public class SavingAccount extends Account {
	
	public int interestReceived, OverDraft;
	
	public void storeData(Account acct, Address address, int interestReceived, int OverDraft) {
		super.storeData(acct.accid, acct.accbalance, acct.accpin, acct.a,acct.c); //take note of this
		this.interestReceived = interestReceived;
		this.OverDraft = OverDraft;
	}
	public void displayData() {
		super.displayData();
		System.out.println("Interest Received: "+interestReceived);
		System.out.println("OverDraft: "+OverDraft);
	}
}
