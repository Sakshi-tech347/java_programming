import java.util.*;

class program5
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        double Income = 0, Tax = 0;
        
        System.out.println("Enter Annual income ");
        Income = sobj.nextDouble();

        if(Income  < 0)
            {   
                System.out.println("Invalid Input ");
            }

        if( Income < 250000)
            {
                Tax = 0;
            }
        else if(Income > 250000 && Income < 500000)
            {
                Tax = (Income - 250000)  * 0.05;
            }
        else if (Income > 500000 && Income < 1000000)
            {
                Tax =  12500+(Income - 250000)  * 0.20;
            }
        else if(Income > 1000000)
            {
                Tax    = 112500 + (Income - 1000000) * 0.30; 
            }
    
            
            System.out.println(" Total payable tax :"+ Tax);

            sobj.close();
    }
}

