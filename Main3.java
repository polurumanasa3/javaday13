class a
{
    public void r()
    {
        System.out.println("Hello");
    }
}
class b extends a{
    public void r1()
    {
        super.r();
        System.out.println("hello Teachers");
    }
}
public class Main3
{
    public static void main(String args[])
    {
        b h=new b();
        h.r1();
    }

}
    

    
     
      