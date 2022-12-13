// wap to read input from user inside the parameterized constructor ...

import java.util.*;
public class rag {
    rag(int x,int y)
    {
       
        System.out.print("sum of two no:"+(x+y));

    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no:");
        int p=sc.nextInt();
        System.out.print("enter the first no:");
        int q=sc.nextInt();
        rag obj=new rag(p,q);
    }
    
    
}
