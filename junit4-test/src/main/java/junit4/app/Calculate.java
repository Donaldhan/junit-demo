package junit4.app;

import junit4.exp.ArgumentException;
import junit4.exp.BussinessException;

/**
 * 
 * @author donald
 * 2017年7月12日
 * 下午9:52:38
 */
public class Calculate {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
     public int sum(int a,int b){
    	 int result = a + b ;
    	 return result;
     }
     /**
      * 
      * @param a
      * @param b
      * @return
      */
     public int multiply(int a,int b){
    	 int result = a*b;
    	 return result;
     }
     /**
      * 
      * @param a
      * @param b
      * @return
     * @throws ArgumentException 
      */
     public int divide(int a,int b) throws ArgumentException{
    	 int result = 0;
    	 if(b == 0){
    		 throw new ArgumentException();
    	 }
    	 else{
    		 result = a/b;
    	 }
    	 return result;
     }
     /**
      * 
      */
     public void hanlderBussiness(){
    	 throw new BussinessException();
     }
     /**
      * 
      * @param obj
      * @return
      */
     public boolean isInteger(Object obj){
    	return obj.getClass().isAssignableFrom(Integer.class);
     }
}
