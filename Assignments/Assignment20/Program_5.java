
class Logic
{

        void findSmallestDigit(int n)
        {
            int iDigit = 0 , min=9;
            while(n != 0)
            {
                iDigit = n%10;
                  if (iDigit < min)
                min = iDigit;

                n = n/10;
            }
            
           
            System.out.println("Smallest Digit in number is :"+ min);

        }   
}


class Program_5
{

public static void main(String A[])
{
    Logic lobj = new Logic();
    lobj.findSmallestDigit(345);

}



}