package Singleton;
public class Earlyinstantiation{
	private static Earlyinstantiation obj=new Earlyinstantiation();// instance will be created at load time  
	 private Earlyinstantiation(){}  
	   
	 public static Earlyinstantiation getA(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 System.out.println("Object Is Created At Load Time"); 
	 }
	 
	 
	 
	 public static void main(String args[])
	 {
	 	Earlyinstantiation ob=Earlyinstantiation.getA();
	 	ob.doSomething();
	 	
	 }
}