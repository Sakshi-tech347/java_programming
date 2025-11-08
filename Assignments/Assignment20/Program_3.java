
class Logic 
{
    void checkDivisible(int num)
    {
        if((num % 5) == 0 && (num % 11) == 0)
        {
            System.out.println(" number is Divisible by 5 and 11");
        }
        else
        {
            System.out.println(" number is not Divisible by 5 and 11");
        }
    
    }
}

class Program_3
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.checkDivisible(55);

    }
}