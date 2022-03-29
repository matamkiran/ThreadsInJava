
public class Display implements Runnable {

	 Thread mythread ;
	 Display()
	   { 
	      mythread = new Thread(this, "Runnable THREADS");
	      System.out.println("my thread created" + mythread);
	      mythread.start();
	   }
	@Override
	public void run() {

	
			 try
		      {
		        for (int i=0 ;i<10;i++)
		        {
		          System.out.println("Printing the count " + i);
		          Thread.sleep(1000);
		        }
		     }
		     catch(InterruptedException e)
		     {
		        System.out.println("my thread interrupted");
		     }
		     System.out.println("mythread run is over" );
		}
		
	}


