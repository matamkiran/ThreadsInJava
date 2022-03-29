
public class TestJoinMethod2 extends Thread {

	public void run(){    
		  for(int i=1;i<=5;i++){    
		   try{    
		    Thread.sleep(5000); 
		    System.out.println(Thread.currentThread().getName());
		   }catch(Exception e){System.out.println(e);}    
		  System.out.println(i);    
		  }    
		 }    
		public static void main(String args[]) throws InterruptedException{    
		 TestJoinMethod2 t1=new TestJoinMethod2();    
		 TestJoinMethod2 t2=new TestJoinMethod2();    
		 TestJoinMethod2 t3=new TestJoinMethod2();    
		 t1.start();    
		 try{    
		  t1.join(1500);    
		 }catch(Exception e){System.out.println(e);}    
		   
		t3.setPriority(10);
		 System.out.println(t2.getName());
		 t2.start();  
		 System.out.println(t3.getName());

		 t3.start();  
		 
		 }   

}
