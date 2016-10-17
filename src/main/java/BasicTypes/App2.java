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
public class App2 {
     static double r=12.6;  
          static double R=15.9;
          static double pi=3.1416;
          static double c=2*pi*r;
          static int a=12;
          static int b=18;
          static int m=15;
          
	public static void main(String args[] ) {
		//Окружность
				System.out.println("Длина окружности:"+ 2*pi*r);
				System.out.println("Площадь окружности:"+ pi*r*r);
				System.out.println("Площадь кольца:"+ pi*(R*R-r*r));
		
		//Треугольник
				System.out.println("Периметр треугольника:"+ (a+b+m));
				System.out.println("Площадь треугольника:"+ (0.5*(a+b+m))*r);
		//Прямоугольник
				System.out.println("Периметр прямоугольника:"+ 2*(a+b));
				System.out.println("Площадь прямоугольника:"+ (a*b));
	}
}
