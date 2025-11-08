
class Logic 
{
    void CalculatePower(int base ,int exp)
    {
      int i = 0;
      int result = 1;

        for (i=1; i<=exp; i++)
        {
            result =result * base;
        }
     
    System.out.println("power of number is :" +result);
    }
}

class Program_5
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);

    }
}