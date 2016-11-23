/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Date;

/**
 *
 * @author Ksenia
 */
public class Student {
    private int id;
    private String Family;
     private String Name;
      private String Surname;
      private String date;
      private String Address;
      private int telephone;
       private String Facultet;
      private String Course;
      private int Group;

    public Student() {
                    
    }

    public Student(int id, String Family, String Name, String Surname, String date, String Address, int telephone, String Facultet, String Course, int Group) {
        this.id = id;
        this.Family = Family;
        this.Name = Name;
        this.Surname = Surname;
        this.date = date;
        this.Address = Address;
        this.telephone = telephone;
        this.Facultet = Facultet;
        this.Course = Course;
        this.Group = Group;
    }

//    Student(String сергей, String бовтрюк, Date date) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

     public Student(String Family, String Name, String date) {
        this.Family = Family;
        this.Name = Name;
        this.date = date;
    }

//    public static class Spysok {
//    private int id;
//    private String Family;
//     private String Name;
//      private String Surname;
//      private String date;
//      private String Address;
//      private int telephone;
//       private String Facultet;
//      private String Course;
//      private int Group;

    

    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String Family) {
        this.Family = Family;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getFacultet() {
        return Facultet;
    }

    public void setFacultet(String Facultet) {
        this.Facultet = Facultet;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int Group) {
        this.Group = Group;
    }
//    public Student (String Family, String Name, Date date) {
//            this.Name = Name;
//            this.Family = Family;
//            this.date = date;
//        }

    @Override
    public String toString() {
        return "Student{"+
                "id=" + id +
                ", Family='" + Family + '\'' +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Date=" + date +
                ", Address='" + Address + '\'' +
                ", Telephone='" + telephone + '\'' +
                ", Facultet=" + Facultet +
                ", course=" + Course +
                ", group='" + Group + '\'' +
                '}';
    }
    
      
      
      
      
    
}

