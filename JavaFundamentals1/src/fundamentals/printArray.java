package fundamentals;

public class printArray {
	
	static String twoDim [][] = {
			{"A","B","C"},
			{"D","E","F"},
			{"G","H","I"},
			{"J","K","L"},
			};	
	/*public static void readTwoDimArray() {  
		for (int row=0;row<4;row++) { //Outer Loop
			for (int col=0;col<3;col++) { //Inner Loop
				System.out.print(twoDim[row][col]+ " ");
			}
		}
	}*/
	public static void printAlphabets() {
		for (int i=1; i<4; i++) {
			System.out.print(i);
		}
	}
	public static void main (String[] args) {
		//readTwoDimArray();
		//printAlphabets();
	}
}
