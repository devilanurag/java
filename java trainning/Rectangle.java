interface polygon
{
    void getArea(int len,int br);
}
class Rectangle implements polygon{
    public void getArea(int len,int br)
    {
        System.out.println("the area of rectangle="+(len*br));
    }
      public static void main(String arg[])
      {
        Rectangle obj=new Rectangle();
        obj.getArea(10,30);
      }
}
