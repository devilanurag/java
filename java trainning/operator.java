public class operator {
    void add(int a, int b)
    {
        int sum= a+b;
        System.out.println("Addition of two integer:"+ sum);
    }
    void add(String s1, String s2)
    {
        String str=s1+s2;
        System.out.println("concatenated string:"+ str);
    }
    public static void main(String arg[])
    {
        operator obj= new operator();
        obj.add(10,20);
        obj.add("operator","overloading");
    }
}
