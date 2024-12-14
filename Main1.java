import java.util.*;
//Multi Level inheritance
class a
{
    public void pl()
    {
        System.out.println("Hello students");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("Hello Teachers");
    }
}
class c extends b
{
    public void r1()
    {
        System.out.println("Hello professors");
}
}
    
public class Main1
{
    public static void main(String args[])
    {
        c f=new c();
        f.pl();
        f.r();
        f.r1();

    }
}
    