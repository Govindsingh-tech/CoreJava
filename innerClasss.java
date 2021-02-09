
public class innerClasss {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {
		innerClasss obj=new innerClasss();
		innerClasss.Inner in=obj.new Inner();  
		in.hello();  


	}

}
