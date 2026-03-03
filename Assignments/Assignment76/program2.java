 
import java.util.*;

class program2
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);
        int Mark= 0, Attendence = 0, Income = 0;
        String Reason = "";


        System.out.println(" Enter your percentage of Marks : ");
        Mark = sobj.nextInt();

        System.out.println(" Enter your percentage of Attendence  : ");
        Attendence = sobj.nextInt();

        System.out.println(" Enter your Family Income  : ");
        Income = sobj.nextInt();

        if( Income <= 0 || (Mark < 0) && (Mark > 100) ||  (Attendence < 0) && (Attendence > 100) )
            {
                System.out.println("Invalid input");
                sobj.close();

                return;
            }

        if(Mark <= 80 )
            {
                Reason =  ("Scholarship rejected :  Due to marks percentage \n");
            }
        else if( Attendence <= 75)
            {
                Reason =  Reason + ("Scholarship rejected :  Due to Attendence percentage \n");

            }
            else if( Income >= 300000)
            {
                Reason= Reason +("Scholarship rejected :  Due to Family Income \n");

            }
             

            if(Reason.equals(""))
                {
                    System.out.println(" Scholarship Approved ");
                }
            else
                {
                    System.out.println(Reason);
 
                }
                
    sobj.close();
    }
}

