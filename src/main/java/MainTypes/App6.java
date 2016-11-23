/*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package MainTypes;

/**
 *
 * @author Ksenia
 */
public class App6 {

    public static void main(String[] args) {
        
    
int[][] tr = new int[5][];
        for(int i = 0; i < 5; i++){
            tr[i] = new int[i+1];
        }
        
        for (int i = tr.length-1; i>=0; i=i-1){
          for (int y : tr[i]){
              System.out.print(y + " ");
          }
          System.out.println(" ");
        }
          System.out.println(" ");
          
        int max = tr[tr.length-1].length;
               
        for(int i = 0; i < tr.length; i++){
            for(int t = 0; t < max -tr[i].length; t++){
                System.out.print("  ");
            }
            for(int j = 0; j < tr[i].length; j++){
                System.out.print(" "+tr[i][j]);
            }
            System.out.println("");
        }
            System.out.println("");
        
            
        
        for(int i = tr.length-1; i >=0; i--){
            for(int t = 0; t < max -tr[i].length; t++){
                System.out.print("  ");
            }
            for(int j = 0; j < tr[i].length; j++){
                System.out.print(" "+tr[i][j]);
            }
            System.out.println("");
        }
        
        
       
    } 
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
