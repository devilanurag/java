//wap to overload two constructor one is default and another is parameterized..
import java.util.*;
public class rag2 {
    rag2(int x,int y)
    {
       
        System.out.println("sum of two no:"+(x+y));

    }
    rag2()
    {
        
        System.out.println("hello world");
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no:");
        int p=sc.nextInt();
        System.out.print("enter the first no:");
        int q=sc.nextInt();
        rag2 obj=new rag2(p,q);
        rag2 obj1=new rag2();
    }
}