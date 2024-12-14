import java.util.*;
class t
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
        //try_catch and finally
        try{
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("Catch block is running");
        }
        finally{
            System.out.println("Finally is running");
        }
    }   
}        
        
        
    


