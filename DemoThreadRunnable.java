
public class DemoThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Display d=new Display();
		Display d1=new Display();
		Display d2=new Display();

		
		while(d.mythread.isAlive()) {
			d.mythread.sleep(1000);
			//System.out.println(d.mythread.getName());
			//System.out.println(d.mythread.getState());

		}
		
		
	}

}
