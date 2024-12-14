import java.util.*;
class Main8
{
    public static void main(String args[])
    {
        //try_catch
        try
        {
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("Bad Request");
        }
    }
}
