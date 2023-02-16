//wap to make a simple calculator for the aithmatical operation like addition,subtraction,multiplication etc using switch case

import java.util.*;
class ArithmeticOperations
{
   public void addition(int a, int b)
   {
         System.out.println(a+b);
    }
    public void subtraction(int a, int b)
   {
         System.out.println(a-b);
    }
    public void multiplication(int a, int b)
   {
         System.out.println(a*b);
    }
    public void division(int a, int b)
   {
         System.out.println(a/b);
    }
}

class calculator
{
   
      public static void main(String[] args) 
      {
            Scanner sc=new Scanner(System.in);
       ArithmeticOperations AO=new ArithmeticOperations();
        System.out.println("Enter two integer values:");

         int a=sc.nextInt(); int b=sc.nextInt();  
         int choice;
        System.out.println("Enter your choice for operations:");
       System.out.println("1.addition"); 
       System.out.println("2.subtraction");
       System.out.println("3.multiplication");
       System.out.println("4.division");
       choice=sc.nextInt();
       switch(choice)
       {
          case 1:
           AO.addition(a,b);
            break;
         case 2:
           AO.subtraction(a,b);
            break;
        case 3:
           AO.multiplication(a,b);
            break;
       case 4:
           AO.division(a,b);
            break;
        default:
          System.out.println("invalid choice");
        }
       }

}