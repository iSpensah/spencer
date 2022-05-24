package bank;

public class Customer {
	
	int cid,  cAccount;
	String cname;
	String[] cphone = {"09458873649","09451278963","09875469123"};

String[] came;	



	public void storeData(int cid, String cname,int cAccount) {
		this.cid = cid;
		this.cname = cname; 
		this.cAccount = cAccount;
	}
	
	public void displayData() {
		System.out.println("Customer Details: ");
		System.out.println("CId: "+cid+"CName: "+cname+"CAccount: "+cAccount);
		System.out.println("Cellphone Number");
		for (int i=0;i<3;i++) {
			System.out.print(cphone[i] + "/ /");
		}
		System.out.println("");
	}
}