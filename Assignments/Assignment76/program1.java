
import java.util.*;

class program1 
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String PeakHr = null;
        double Amount = 0;
        
        

        System.out.println(" Enter Distance : ");
        Distance = sobj.nextInt();

        System.out.println(" Enter Peak Hours : ");
        PeakHr = sobj.next();

        if( Distance <= 0 ||PeakHr.equalsIgnoreCase("Yes")== false &&PeakHr.equalsIgnoreCase("No")== false  )
            {
                System.out.println("Invalid Input ");

            }

        if(Distance < 10)
            {
                Amount = 50 + (Distance * 12);
            }
        else if( Distance > 10)
            {
                Amount =  170 + ((Distance- 10 )* 15);
            }

        else if(PeakHr == "Yes")
            {  

                Amount  =  Amount +(Amount * 0.20);
            }

        System.out.println(" Distance :"+Distance);
        System.out.println(" Peak Hours (Yes / No ) :"+PeakHr);
        System.out.println(" Total Fair  : "+Amount);


        sobj.close();

        
    }    
}

 
