package bank;

public class Account {
	
	int accid, accbalance,accpin;
	Address a;
	Customer c;
	
		public void storeData(int accid, int accbalance, int accpin, Address newa, Customer newc) {
			this.accid = accid;
			this.accbalance = accbalance;
			this.accpin = accpin;
			this.a = newa;
			this.c = newc;
		}
		public void displayData() {
			System.out.println("Accid: "+ accid);
			System.out.println("Accid: "+ accbalance);
			System.out.println("AccountPin: "+accpin);
			c.displayData();
			a.displayData();
		}
}
