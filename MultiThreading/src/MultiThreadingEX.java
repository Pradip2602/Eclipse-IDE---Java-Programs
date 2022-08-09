



class Thread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0 ; i<5 ;i++) {
			System.out.println("*");
		}	
	}
	
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<5 ;i++) {
			System.out.println("#");
		}	
	}
}
public class MultiThreadingEX {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();	
		Thread2 t2 = new Thread2();
		System.out.println(t1.getName());
		t1.setName("My Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		t1.start();
		t2.start();
	}
}
