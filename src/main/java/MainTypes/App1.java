/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTypes;

/**
 *
 * @author Ksenia
 */
public class App1 {
    	
	static int x;


	public static void main(String[] args) {
		int sum=0;
		for(int x=0;x<100;x=x+1){
    		sum=sum+x;
			System.out.println("Кратные 2:"+x++);	
			System.out.println("Cумма чисел кратных 2:"+sum);	
						
	}
        for(int x=0;x<100;x=x+2){
        	sum=sum+x;
			System.out.println("Кратные 3:"+x++);
			System.out.println("Cумма чисел кратных 3:"+sum);	
	}
         for(int x=0;x<100;x=x+4){
        	 sum=sum+x;
	        System.out.println("Кратные 5:"+x++);
	        System.out.println("Cумма чисел кратных 5:"+sum);	
}
         for(int x=0;x<100;x=x+6){
        	 sum=sum+x;
 	        System.out.println("Кратные 7:"+x++);
 	       System.out.println("Cумма чисел кратных 7:"+sum);	
 }
         
 }

}
