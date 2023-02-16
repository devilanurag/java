import java.util.*;
class Student{
 Scanner sc=new Scanner(System.in);  
 String name;
 int roll;

 public void getdata()
{
     
    System.out.println("Enter the student name:");
    String name=sc.nextLine();
    System.out.println("Enter the student roll:");
   roll=sc.nextInt();
}}
class Exam extends Student{
      public void display()
{
    Scanner sc= new Scanner(System.in);
   System.out.println("Enter marks of 1st subj:");
   int n1=sc.nextInt();
  System.out.println("Enter marks of 2nd subj:");
   int n2=sc.nextInt();
  System.out.println("Enter marks of 3rd subj:");
   int n3=sc.nextInt();
  System.out.println("Enter marks of 4th subj:");
   int n4=sc.nextInt();
  System.out.println("Enter marks of 5th subj:");
   int n5=sc.nextInt();
 System.out.println("Enter marks of 6th subj:");
   int n6=sc.nextInt();
    int Res= n1+ n2+n3+n4+n5+ n6;
 System.out.println(" the result is "+ Res);
     float avg= (n1+ n2+n3+n4+n5+ n6)/6;
     System.out.println(" the avg is "+ avg);
     System.out.println(" the percentage is "+ (avg*100)/600	);
}
}
class result extends Exam
{
   public static void main(String arg[])
  {
    
     result res= new result();
     res.getdata();
     res.display();

  }
}