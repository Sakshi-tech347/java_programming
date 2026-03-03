import java.util.*;
class program3
{
    public static void main(String A[])
    {
    
        Scanner sobj = new Scanner(System.in);

    int currentStock = 0;
    int reqQuantity = 0;
    int remstock = 0;

    System.out.println(" enter Cuurent stock  :");
    currentStock = sobj.nextInt();

    System.out.println(" enter Requested Quantity :");
    reqQuantity= sobj.nextInt();
         

    if(currentStock < 0 || reqQuantity < 0)
        {
            System.out.println("Invalid input ");
            return;
        }
     
    
    if(reqQuantity > currentStock)
        {
            System.out.println("Order Fails  : Insufficient stock");

        }
    else 
        {
                System.out.println(" Order proceess Succefully");
                remstock =  currentStock - reqQuantity;  
        }
    if(remstock < 5)
        {
            System.out.println(" Low Stock Alert ");
        }
    }
}
