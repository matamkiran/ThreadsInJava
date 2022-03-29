
public class RunnableThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("my theard using runnable interface");
		
	}
	public static void main(String[] args ) {
		RunnableThreadDemo r= new RunnableThreadDemo();
		r.run();
	}

}
