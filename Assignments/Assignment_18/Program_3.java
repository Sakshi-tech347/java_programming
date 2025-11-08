
class Logic
{

    void printOddNumber(int num)
    {
        int i =0;
        
    
            for (i=1 ; i<=num; i++ )
            {
                 if(i % 2 !=0)
                 {
                    
                   System.out.print( + i);
                 }
            }
    
    }

}

class Program_3
{

    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printOddNumber(20);


    }



}