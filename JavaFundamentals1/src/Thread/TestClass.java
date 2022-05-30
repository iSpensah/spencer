package Thread;

class FirstThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value of i : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SecondThread implements Runnable {
	public SecondThread() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		for (int j = 0; j < 10; j++) {
			System.out.println("Value of j : " + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TestClass {

	void fun() {
		FirstThread f = new FirstThread();
		SecondThread s = new SecondThread();

		f.start();
	}

	public static void main(String s[]) {

		TestClass obj = new TestClass();
		obj.fun();

		System.out.println("Main function terminated");
	}
}