
class Logic
{

        void checkNumber(int n)
        {
            int i =0 , iSum =0;

            for(i=1; i<=(n/2) ; i++)
            {
            
                    if(n%i == 0)  
                {
                    //System.out.println(+i);
                    iSum = i + iSum;
                }
                
            }

            if(iSum == n)
            {
                System.out.println("it is a perfect number ");
            }
            else
            
            {
                System.out.println("it is not perfect number ");
            }
            
        }   
}


class Program_3
{

public static void main(String A[])
{
    Logic lobj = new Logic();
    lobj.checkPerfect(6);

}

}
