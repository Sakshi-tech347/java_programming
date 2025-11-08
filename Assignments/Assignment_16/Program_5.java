
class Logic
{
   
    void countDigit(int num )

    {
       
        int iDigit = 0;
        int iCount = 0;

        if(num <= 0)
        {
            num = -num;
        }
        
        while(num != 0)
        {
            //iDigit = num % 10 ;
            //System.out.print(+iDigit);
            
            num = num / 10;
            iCount++;
            

            
        }    
        System.out.print(+iCount);
    }
}

    
    

    public class Program_5

    {
    
        public static void main(String[] args) {
      
        Logic lobj = new Logic();
        lobj.countDigit(1234);
      
    }
}

