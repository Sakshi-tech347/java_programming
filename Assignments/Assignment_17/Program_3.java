
class Logic
{
    void findMax(int a, int b) 
    {
       if(a > b)
       System.out.println( "is a maximum number of "+a);

       else
       System.out.println( "is a maximum number of "+b);
        
    }

}




class Program_3
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(20 ,15);
        

    }
}