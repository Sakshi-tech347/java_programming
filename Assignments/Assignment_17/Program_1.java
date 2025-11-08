
class Logic
{
    void sumOfDigit(int num) 
    {
        int iDigit =0;
        int iSum = 0;

        while( num != 0)
        {
            iDigit = num % 10 ;
            num = num / 10;

            iSum = iDigit + iSum;
        }

        System.out.println("sum of Digit"+ iSum);
    }

}

class Program_1
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.sumOfDigit(1234);
        
    }
}
