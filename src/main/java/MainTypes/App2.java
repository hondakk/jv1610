/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTypes;

import java.util.Random;



/**
 *
 * @author Ksenia
 */
public class App2 {

        public static void main(String[] args) {
              
Random randomGenerator=new Random();
int rnd= randomGenerator.nextInt(100);
System.out.println(rnd);

                  if(rnd<10){
                     int x=rnd;
                 switch(x){
                    
		case 0:{
			System.out.println("ноль");
		}break;                             //break-для того чтобы выводилось, только то что запрашиваем в switch
		case 1:{
			System.out.println("один");
		}break;
		case 2:{
			System.out.println("два");
		}break;
		case 3:{
			System.out.println("три");
		}break;
		case 4:{
			System.out.println("четыри");
		}break;
		case 5:{
			System.out.println("пять");
			
		}break;
		case 6:{
		
			System.out.println("шесть");
		}break;
		case 7:{
			System.out.println("семь");
		}break;
		case 8:{
			System.out.println("восемь");
		}break;
		case 9:{
			System.out.println("девять");
		}break;}
                  }else{
                        if(rnd<20){
                            int y=rnd;
                        switch(y){
		case 10:{
			System.out.println("десять");
		}break;
		case 11:{
			System.out.println("одинадцать");
		}break;                             
		case 12:{
			System.out.println("двенадцать");
		}break;
		case 13:{
			System.out.println("тринадцать");
		}break;
		case 14:{
			System.out.println("четырнадцать");
		}break;
		case 15:{
			System.out.println("пятнадцать");
		}break;
		case 16:{
			System.out.println("шестнадцать");
			
		}break;
		case 17:{
		
			System.out.println("семнадцать");
		}break;
		case 18:{
			System.out.println("восемнадцать");
		}break;
		case 19:{
			System.out.println("девятнадцать");
		}break;
		}
		
                        }else{ 
                            if(rnd<100){
                        int z= rnd/10;
                            switch(z){
                case 3:{
			System.out.println("тридцать");
		}break;

		case 4:{
			System.out.println("сорок");
		}break;

		case 5:{
			System.out.println("пядесят");
		}break;

		case 6:{
			System.out.println("шестдесят");
		}break;

		case 7:{
			System.out.println("семьдесят");
		}break;

		case 8:{
			System.out.println("восемьдесят");
		}break;
		case 9:{
			System.out.println("девяносто");
		}break;
            }
            int k=rnd%10;
            switch(k){
                case 1:{
			System.out.println("один");
		}break;
		case 2:{
			System.out.println("два");
		}break;
		case 3:{
			System.out.println("три");
		}break;
		case 4:{
			System.out.println("четыри");
		}break;
		case 5:{
			System.out.println("пять");
			
		}break;
		case 6:{
		
			System.out.println("шесть");
		}break;
		case 7:{
			System.out.println("семь");
		}break;
		case 8:{
			System.out.println("восемь");
		}break;
		case 9:{
			System.out.println("девять");
		}break;
            
        }
            
        }
                                
        }
        }
                        
}
    }
