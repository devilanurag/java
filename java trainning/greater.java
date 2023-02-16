//wap to find greater integer no among three given numbers..
 
import java.util.*;
class greater
{
              public static void main(String arg[])
        {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter any three number:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
          if(a>b && a>c)
           {
              System.out.println("the first no is greater...");
           }
            else if(b>c)
               System.out.println("the second no is greater....");
            else
               System.out.println("the third no is greater....");
         }
}
