//wap to read input from user inside the default constructor...


import java.util.*;
class Stu
{    int age;
     String name;
    Stu()
    {    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
         age=sc.nextInt();
         System.out.print("Enter your name:");
         name=sc.next();
    }

public static void main(String a[])
{
    Stu obj=new Stu();
}
}