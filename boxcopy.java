//write a java program usingcopy constructor....
public class boxcopy {
    int w,h,d;
    boxcopy()
    {
        w=8;
        h=4;
        d=4;
    }
    boxcopy(int x)
    {
      w=h=d=x;
    }
    boxcopy(int w,int h,int d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }
    boxcopy(boxcopy obj)
    {
        w=obj.w;
        h=obj.h;
        d=obj.d;
    }
    void volume()
    {
        System.out.println(w*h*d);
    }
    public static void main(String a[])
    {
        boxcopy obj1=new boxcopy();
        obj1.volume();
        boxcopy obj2=new boxcopy(10);
        obj2.volume();
        boxcopy obj3=new boxcopy(1,2,3);
        obj3.volume();
        boxcopy obj4=new boxcopy(obj3);
        obj4.volume();
    }
}
