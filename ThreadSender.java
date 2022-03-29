
public class ThreadSender extends Thread {
	
	private String message;
	Sender sender;
	
	ThreadSender(String message,Sender s){
		this.message=message;
		sender=s;
	}
	
	
	public void run() {
		
		synchronized(sender) {
		
		sender.send("hello am a non synchronized block"+ message);
		}
		
	}

}
