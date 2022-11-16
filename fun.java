import java.util.Scanner;
class fun
{
    int x,y;
    Scanner sc=new Scanner(System.in);
    void show()
    {
        System.out.println(x+y);
    }
    public static void main(String a[])
    {
        fun ob=new fun();
        System.out.println("enter the value:");
        ob.x=ob.sc.nextInt();
        ob.y=ob.sc.nextInt();
        ob.show();
    }
}