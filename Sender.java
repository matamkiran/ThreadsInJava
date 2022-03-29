
public class Sender {
	
	
	public void send(String m) {
		
		System.out.println("Sending msg! from sender" +m);
		
		try {
			Thread.sleep(1000);
			
		}catch(Exception msg) {
			System.out.println("Thread Interrupted");
		}
		
	}

}
