
class Logic 
{
    void PrintDigit(int num)
    {
      int iDigit =0;

        while(num != 0)
        {
            iDigit = num % 10;
            System.out.println(+iDigit);
            num = num /10; 
        }
     
    
    }
}

class Program_4
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigit(9876);

    }
}