 
import java.util.*;

class program2
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);
        int Weight = 0, Amount = 0;
        
        System.out.println(" Enter Parcel Weight :");
        Weight = sobj.nextInt();

        if( Weight <= 0)
            {
                System.out.println(" Invalid Input ");
            }
        if(Weight == 1)
            {
                 Amount = 50;
            }
        else if( Weight >= 1  && Weight <= 5)
            {
                Amount = 50 + ( Weight ) * 20;
            }
        else if(Weight > 5)
            {
                Amount = 150 + (Weight - 5) * 30;
            }

            System.out.println(" parcel Weight in Kg: "+ Weight );
            System.out.println("Courier Charge : "+ Amount);

                


    sobj.close();
      


    }
}




 
