
class Logic
{
   
    void CheckEvenOdd(int n)
     {
        
  

            if(n %2  == 0 )
            {
                 System.out.println( "it is a even number" +n);
            }
            else 
            {
                 System.out.println( " it is a Odd number" +n);
            }
       
       
    }
}
    
    

        public class Program_2

{
    
        public static void main(String[] args)
         
    {
      
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(7);
      
    }
}

