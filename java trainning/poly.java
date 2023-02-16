 class bank {
    float getRateOfString()
    {
        return 100.0f;
    }
}
 class SBI extends bank{
    float getRateOfString()
    {
        return 8.4f;
    }
}
 class ICICI extends bank{
    float getRateOfString()
    {
        return 7.3f;
    }
}
 class AXIS extends bank{
    float getRateOfString()
    {
        return 9.7f;
    }
}
class poly
{
    public static void main(String arg[])
    {
        bank ob1=new bank();
        System.out.println("rate of main bank:"+ob1.getRateOfString());
        SBI ob2=new SBI();
        System.out.println("rate of SBI bank:"+ob2.getRateOfString());
        ICICI ob3=new ICICI();
        System.out.println("rate of ICICI bank:"+ob3.getRateOfString());
        AXIS ob4=new AXIS();
        System.out.println("rate of AXIS bank:"+ob4.getRateOfString());
    }
}
