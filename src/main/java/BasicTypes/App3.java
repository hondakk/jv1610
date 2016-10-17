/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTypes;

/**
 *
 * @author Ksenia
 */
public class App3 {
   static double r=12.6;  
    static double R=15.9;
    static double pi=3.1416;
    static double H=17.8;
    static double V=H*pi*r*r;
    static int a=12;
    static int b=18;
    static int m=15;
	public static void main(String[] args) {
	                 // цилиндр
		System.out.println("Объем цилиндра:"+V);
		if(R>r){
			System.out.println("Объем полного цилиндра: "+pi*H*(R*R-r*r));
			   }
		System.out.println("Площадь боковой поверхности не полного цилиндра: "+2*pi*r*H);
	                 // шар
		System.out.println("Объем шара: "+(4*pi*R*R*R)/3);
		System.out.println("Площадь поверхности шара: "+4*pi*R*R);
		             // прямоугольный паралелепипед 
		System.out.println("Объем прямоугольного паралелепипеда: "+ a*b*m);
		System.out.println("Площадь поверхности прямоугольного паралелепипеда: "+  2*(a*b + b*m + a*m));
		             //тетраэдр
		System.out.println("Объем тетраэдра: "+ (((0.5*(a+b+m))*r)*H)/3);
		System.out.println("Объем тетраэдра: "+ 4*((0.5*(a+b+m))*r));
	}

}
