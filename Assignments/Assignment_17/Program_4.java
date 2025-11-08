
class Logic
{
    void findMin(int a, int b, int c) 
    {
       if(a < b && a < c)
       System.out.println( "is a minimum number of "+a);

       else if(b < c) 
       System.out.println( "is a minimum number of "+b);

       else
       System.out.println( "is a minimum number of "+c);
        
    }

}




class Program_4
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(3,7,2);
        

    }
}