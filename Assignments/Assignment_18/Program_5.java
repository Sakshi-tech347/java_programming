
class Logic
{

    void CheckSign(int num)
    {
       if(num ==0)
       System.out.println("number is eual zero");

       else if ( num < 0)
        System.out.println("number is negative");

        else
         System.out.println("number is Positive");

        
        
    
           
    
    }

}

class Program_5
{

    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);

    }



}