
public class ThreadSyncDemo {

	public static void main(String[] args) {

		Sender s= new Sender();
		
		
		ThreadSender ts= new ThreadSender("hello",s);

		ThreadSender ts2= new ThreadSender("bye",s);
		
		ts.start();
		ts2.start();
		
		try {
			ts.join();
			ts2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
