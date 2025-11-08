
class Logic
{

    void printEvenNumber(int num)
    {
        int i =0;
        
    
            for (i=1 ; i<=num; i++ )
            {
                 if(i % 2 ==0)
                 {
                    
                   System.out.print( + i);
                 }
            }
    
    }

}

class Program_2
{

    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printEvenNumber(20);


    }



}