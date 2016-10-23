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
public class App5 {
    static int n=5;
    static int m=5;
    
    public static void main(String[] args) {
        int sum=0;
        int proiz=0;
        int [][]x;
        x=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                x[i][j]=(int) ( Math.random ()*2*n);
                System.out.print(x[i][j]+" ");
            }
              System.out.println(" ");   
        }
        System.out.println(" ");  
       for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
             System.out.print(x[i][j]+" ");
            }
              System.out.println(" ");   
        }
       for(int i=1;i<n-1;i=i+2){
           for(int j=0; j<m;j++){
               if(x[i][j]%2==0){
                  System.out.println("Четные эл:"+x[i][j]); 
        
               }
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0; j<m;j=j+2){
                if(x[i][j]%2!=0){
                   System.out.println("Нечетные эл:"+x[i][j]); 
               
               }
           }
       }
      for(int i=1;i<n-1;i=i+2){
           for(int j=0; j<m;j++){
               if(x[i][j]%7==0){
                      sum+=x[i][j];
                   
                     System.out.println("Сумма:"+sum); 
                  }
               
           }  
           }
      for(int i=0;i<n;i++){
           for(int j=0; j<m;j=j+2){
              if(x[i][j]%3==0){ 
                  proiz= proiz*x[i][j];
                   System.out.println("Произ:"+proiz); 
              }
           }
           }
    }
}
