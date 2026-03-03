import java.util.*;
class program1 
{
    public static void main(String A[])
    {

        int Total_ParkingHr = 0;
        int Amount = 0, iFine = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Total parking hours :");
        Total_ParkingHr = sobj.nextInt();

        if(Total_ParkingHr <= 0)
            {
                System.out.println(" Invalid output");
                return;
            
            }

        if(Total_ParkingHr <= 2)
            {
                Amount = 20;
                
            }
        if(Total_ParkingHr > 2 || Total_ParkingHr <= 10)
            {
                Amount =  20 + (Total_ParkingHr - 2 ) *10;
            }
        if( Total_ParkingHr > 10)
            {
                iFine = 50;
                Amount = iFine + 100;
                                
                Amount =  Amount + (Total_ParkingHr - 10 )*10;
                

            }

            System.out.println("Total Parking Duration :"+Total_ParkingHr+"Hours");
            System.out.println("Total Parking Fee :"+Amount);

    }    
}


/*

 

*/
