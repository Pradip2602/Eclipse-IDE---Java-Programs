

public class RunnableEX {

	public static void main(String[] args) {
		
		Runnable ref=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("A");
			}
		};
		
		Runnable ref1=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("B");
			}
		};
		
		Thread t1 = new Thread(ref);
		Thread t2 = new Thread(ref1);
		
		t1.start();
		t2.start();
		
	}

}
