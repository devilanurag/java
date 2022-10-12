import java.util.Scanner;
class Student
{
private String name;
private int age;
private float cgpa;
Scanner scan;
public void getData()
{
scan = new Scanner(System.in);
System.out.println("Enter Your Name : ");
name = scan.nextLine();
System.out.println("Enter Your Age : ");
age = scan.nextInt();
System.out.println("Enter Your CGPA : ");
cgpa = scan.nextFloat();
}
public void showData()
{
System.out.println("Your Name is : " + name);
System.out.println("Your Age is : " + age);
System.out.println("Your CGPA is : " + cgpa);
}
public static void main(String[] args)
{
Student obj = new Student();
obj.getData();
obj.showData();
}
}






























































