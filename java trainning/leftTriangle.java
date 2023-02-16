import java.io.*;
public class leftTriangle
{  
    public static void printStars(int n)
    {
        int i, j;
 
        for(i=n; i>0; i--)
        { 
            for(j=i; j>=1; j--)
            {
               
                System.out.print("* ");
            }           
            System.out.println();
        }
   }
 
    public static void main(String args[])
    {
        int n = 5;
        printStars(n);
    }
}