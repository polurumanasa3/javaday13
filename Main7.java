import java.util.*;
 class library
{
    String name;
    int bb;
    library(String name)
    {
        this.name=name;
        this.bb=0;
    }
    public boolean cb()
    {
        return false;
    }
    public void bob()
    {
        if(cb())
        {
            bb++;
            System.out.println(name+"you borrowed"+bb+"book");
        }
        else
        {
            System.out.println("your Limit exceeded!");
        }
    }
    public void rb()
    {
        if(bb>0)
        {
            bb--;
               System.out.println(name+"you borrowed"+bb+"book");
        }
        else
        {
            System.out.println("your Limit exceeded!");
        }
    }
            
        }
    
class students extends library
{
    students(String name)
    {
        super(name);
    }
    public boolean cb()
    {
        return bb<3;
}
}class teachers extends library
{
    teachers(String name)
    {
        super(name);
    }
    public boolean cb()
    {
        return bb<10;
}
}
public class Main7
{
    public static void main(String args[])
    {
        library a=new students("Amar");
        library b1=new students("latitha");
        library b=new students("Dr.prem kumar");
        b1.bob();
        b1.bob();
        b1.bob();
        b1.rb();
    }
}