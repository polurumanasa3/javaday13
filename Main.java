import java.util.*;
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
public class Main
{
    public static void main(String args[])
    {
        a h=new a();
        h.pl();
        b y=new b();
        y.pl();
        y.r();

    }
}
    

 
