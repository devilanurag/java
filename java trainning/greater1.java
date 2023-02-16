import java.util.*;
class greater1
{
              public static void main(String arg[])
        {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter any three number:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
          if(a>b )
           {
                 if(a>c)
              System.out.println("the first no is greater...");
                 else
                   System.out.println("the third no is greater...");
           }
            else if(b>a)
                 {
                    if(b>c)
               System.out.println("the second no is greater....");
                   else
               System.out.println("the third no is greater....");}
             else
               System.out.println("the third no is greater...");
         }
}
