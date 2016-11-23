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
public class App4 {
    static int n=200;
	static int sum=0;
	static double proiz=0;
	public static void main(String[] args) {
	int[]x,v;
	x=new int[n];
	v=new int[n];
	for(int i=0;i<n;i++){
		x[i]=i;
		
	}
	for(int i=0;i<n;i++){
		x[i]=(int) ( Math.random() * n);
		System.out.print(x[i]+" ");
	}
	System.out.println();
	for(int i=n-1;i>=0;i--){
//		x[i]=(int) ( Math.random() * n);
		System.out.print(x[i]+" ");
	}
	System.out.println();
	
	
	for(int i=0;i<n;i++){
		if(x[i]%2==0){
			System.out.println("Четные элементы"+x[i]);
		}
	}
        
        for(int i=0;i<n;i++){
		if(x[i]%2-1==0){
			System.out.println("НеЧетные элементы"+x[i]);
		}
	}
	for(int i=0;i<n;i++){
		if(x[i]%7==0){
			sum=sum+x[i];
			System.out.println("Сумма чисел кратных 7:"+ sum);
		}
	}
	for(int i=0;i<n;i++){
		if(i%3==0){
		proiz=(double)x[i]*x[i+1];
			System.out.println("Произведение чисел кратных 3:"+ proiz);
		}
	}
        }
}
