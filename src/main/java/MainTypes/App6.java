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
public class App6 {

    public static void main(String[] args) {
        int n;
        
        int v=3;
        int m=4;
        int [][]x;
        x=new int [v][m];
//        int n=x[0][0];
        for(int i=0;i<v;i++){
             for(int j=0;j<m;j++){
                 x[i][j]=(int) ( Math.random ()*2*v);
                  System.out.print(x[i][j]+" ");
             }
             System.out.println(" ");
        }
         System.out.println(" ");
        for(int i=0;i<v;i++){
             for(int j=0;j<m;j++){
                 n=x[i][j];
                 x[i][j]=x[i-1][j];
                 x[i-1][j]=n;
                 System.out.print(n+" ");
             }
              System.out.println(" ");
             }
        System.out.println(" ");
        for(int i=0;i<v;i++){
             for(int j=0;j<m;j++){
                 n=x[i][j];
                 x[i][j]=x[i+1][j];
                 x[i+1][j]=n;
                 System.out.print(n+" ");
             }
              System.out.println(" ");
             }
    }
    
}
