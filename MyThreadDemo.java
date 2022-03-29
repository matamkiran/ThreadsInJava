
public class MyThreadDemo extends Thread {
	
	MyThreadDemo thread;
	public MyThreadDemo(String string) {

		System.out.println(string);
	}

	public void run() {
		System.out.println("Thread started using Thread class");
		for(int i=0;i<10;i++) {
			try {
				thread.sleep(100);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MyThreadDemo t1= new MyThreadDemo("Thread1");
		MyThreadDemo t2= new MyThreadDemo("Thread2");
	
		t1.start();
		t2.start();
	}

}
