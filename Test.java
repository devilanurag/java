//define a class Base with data members string name integer age and member function getBaseData and showBaseData..
//define another class with data member string Branch and i nteger semester and member functions are getchilddata and showchilddata..
//child is a derive class from base initialize object of the child class and access all its member methods as well as..
//member methods of base class to show the existence of inheritance among them..implement this scenario in java..
import java.util.*;
class Base 
{
     private String name;
     private int age;
     public void getBaseData() {
     Scanner scbase = new Scanner(System.in);
     System.out.println("Enter your Name : ");
     name = scbase.nextLine();
     System.out.println("Enter your Age : ");
     age = scbase.nextInt(); }
     public void showBaseData() {
     System.out.println("Your Name is : " + name);
     System.out.println("Your Age is : " + age); }
}

class Child extends Base
 {
     private String branch;
     private int sem;
     public void getChildData() {
Scanner scder = new Scanner(System.in);
System.out.println("Enter your Branch : ");
branch = scder.nextLine();
System.out.println("Enter your Semester : ");
sem = scder.nextInt(); }
     public void showChildData() {
System.out.println("Your Branch is : " +branch);
System.out.println("Your Semester is : " + sem); }
}
class Test 
{
     public static void main(String[] args)
   {
     Child obj = new Child();
     obj.getBaseData();
     obj.getChildData();
     obj.showBaseData();
     obj.showChildData();
    } 
}