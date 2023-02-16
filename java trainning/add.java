//wap in java to print addition of three integers values( values must be given by the users)

import java.util.Scanner;
class add 
{
    
              public static void main(String arg[])
              { 
                 Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the three numbers:");
                 int a=sc.nextInt();
                 int b=sc.nextInt();
                 int c=sc.nextInt();
                 int sum=a+b+c;
                System.out.println("the sum of three numbers=" + sum);                
               }
}