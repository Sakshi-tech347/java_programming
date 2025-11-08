
class Logic
{

        void findLargestDigit(int n)
        {
            int iDigit = 0 , max =0;
            while(n != 0)
            {
                iDigit = n%10;
                  if (iDigit > max)
                max = iDigit;

                n = n/10;
            }
            
           
            System.out.println("largest Digit in number is :"+ max);

        }   
}


class Program_4
{

public static void main(String A[])
{
    Logic lobj = new Logic();
    lobj.findLargestDigit(1345);

}

}
