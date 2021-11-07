package ybs.oop.project1;

public class Main {

	public static void main(String[] args) {	
		fibonacci(5);
	}
	
	public static void fibonacci(int limit){
	    int limit1,limit2=1,total=0,i;
            System.out.println(limit2); 
            for(i=0;i<limit;i++)
              {     
              limit1=limit2;
              limit2=total;
		          total=limit1+limit2;	  
              System.out.println(total);  
                      
     
              }
  
  
  
  
  



	}
}
