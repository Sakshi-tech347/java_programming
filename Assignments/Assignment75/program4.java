import java.util.*;
class program3
{
    public static void main(String A[])
    {
    
        Scanner sobj = new Scanner(System.in);

    String Worn = null;
    String Licence = null;
    String Speed = null;
    int Fine1 = 0, Fine2 =0,Fine3 = 0;
    int TotalFine = 0;

    System.out.println(" Helmet  ");
    Worn = sobj.next();

    System.out.println(" Licennce ");
    Licence = sobj.next();

    System.out.println(" Overspeeding ");
    Speed = sobj.next();


    if(Worn.equalsIgnoreCase("Yes") == false &&Worn.equalsIgnoreCase("No")== false ||
        Licence.equalsIgnoreCase("Yes")== false &&Licence.equalsIgnoreCase("No")== false  ||
        Speed.equalsIgnoreCase("Yes")== false&&Speed.equalsIgnoreCase("No")== false 
    )
    {
        System.out.println("Invalid Input ");
    }
    if(Worn.equalsIgnoreCase("No"))
        {
            Fine1 = 500;
        }
    if( Licence.equalsIgnoreCase("No"))
        {
            Fine2 = 1000;
        }
    if( 
        Speed.equalsIgnoreCase("yes"))
        {
            Fine3 = 1500;
        }


    TotalFine = Fine1 + Fine2 + Fine3;
    if( TotalFine == 0)
        {
            System.out.println(" No Fine ");
        }
    else{
            System.out.println(" Total fine is :"+ TotalFine);


    }
    }
}
