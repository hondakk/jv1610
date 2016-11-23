/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ksenia
 */
public class StudentMain {
    public static void main(String[] args) {
           Student[] students = new Student[4];
            Date[] date = new Date[4];
             
            String[]Date={
                " 13.01.1999",
                 " 15.05.1998",
                  " 03.07.1985",
                   " 23.03.1996",
            };
//            for (int i = 0; i < 4; i++) {
//           date[i] = new DateFormat("yyyy-mm-dd").parse(date[i]);
//        }
            String[]Family={
                " Карась",
                 " Петренко",
                  " Михальчук",
                   " Сидоров",
            };
            
            String[]Name={
                " Иван",
                 " Петр",
                  " Евгений",
                   " Александр",
            };
            students[0]=new Student(Name[0], Family[0], Date[1]);
            
            System.out.println(students[0]);
            
            
    }
}
