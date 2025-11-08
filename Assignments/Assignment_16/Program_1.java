
class Logic
{
   
    void calculateSum(int n)
     {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of  natural numbers = " + sum);
    }
}
    
    

    public class Program_1

    {
    
        public static void main(String[] args) {
      
        Logic lobj = new Logic();
        lobj.calculateSum(10);
      
    }
}
