
class Logic
{
    void sumOfDigit(int num) 
    {
        int iDigit =0;
        int iRev = 0;

        int Temp = num ;

        while( num > 0)
        {
            iDigit = num % 10 ;
            iRev = iRev * 10 + iDigit;
            num = num / 10;
        }
        
        if (Temp == iRev)
        
            System.out.println("this is a palindroam number "+ Temp);
        else
        
             System.out.println("this is not a palindroam number "+ Temp);
        
    }

}




class Program_2
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.sumOfDigit(121);
        

    }
}