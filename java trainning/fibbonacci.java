//wap in java to display fibonacci series uo to nth term

import java.util.*;

class fibbonacci
{
  public static void main(String arg[])
   {
      int n=9, n1=0, n2=1;
      System.out.println("Fibonacci Series till "+ n+ "term :");
 
     for(int i=1; i<=n; ++i){
         System.out.print( n1 +" ,");

        int nextTerm = n1 + n2;
         n1=n2;
          n2= nextTerm;}
    }
}