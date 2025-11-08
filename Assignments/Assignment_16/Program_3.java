
class Logic
{
   
    void FindFactorial(int num )

    {
        int i = 0;

        if(num <= 0)
        {
            num = -num;
        }

        for(i=1; i<=num ; i++)
        {
            if(num%i ==0)
            
                System.out.println("factorial of number" +i);
            

        }    
  
    }
}

    
    

    public class Program_3

    {
    
        public static void main(String[] args) {
      
        Logic lobj = new Logic();
        lobj.FindFactorial(10);
      
    }
}

