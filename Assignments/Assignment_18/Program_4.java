
class Logic
{

    void SumEvenOddDigit(int num)
    {
        int i =0;
        int iSumEven =0;
        int iSumOdd = 0;
        
    
            for (i=1 ; i<=num; i++ )
            {
                 if(i % 2 ==0)
                 {
                    iSumEven = i +iSumEven;
                   
                 }
                 else
                 {
                    iSumOdd = i +iSumOdd;
                  
                 }
            }
             System.out.println( + iSumEven);
             System.out.println( + iSumOdd);
    
    }

}

class Program_4
{

    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigit(123456);

    }

}