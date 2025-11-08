
class Logic
{

    void CheckPrime(int num)
    {
        int i =0;
        
         int iFrequency =0;

            for (i=2 ; i<=(num /2);i++ )
            {
                 if(num % i ==0)
                 {
                    iFrequency++;
                 } 
            }
       
            if(iFrequency ==2)

                System.out.println("This is prime number " + num);

                else 
                System.out.println("This is not  prime number " + num);



    }
}

class Program_1
{

    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);


    }
}
