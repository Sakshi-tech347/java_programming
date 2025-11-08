
class Logic
{
   
    void reverseNumber(int num )

    {
        int i = 0;
        int iDigit = 0;

        if(num <= 0)
        {
            num = -num;
        }

        while (num != 0)
        {
            iDigit = num % 10 ;
            System.out.print(+iDigit);

            num = num/10;
            
        }    
  
    }
}

    
    

    public class Program_4

    {
    
        public static void main(String[] args) {
      
        Logic lobj = new Logic();
        lobj.reverseNumber(1234);
      
    }
}

