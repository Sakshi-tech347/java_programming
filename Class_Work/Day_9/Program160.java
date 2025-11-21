
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = -iNo ; iCnt < 1 ; iCnt ++)
        {
            System.out.print(iCnt+"\t");

        }
        int iCount =0;
        for(iCount = 1; iCount <= iNo ; iCount ++)
        {
            System.out.print(iCount+"\t");
        }
            System.out.println();
    }
}


class Program160
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue =0;

        System.out.println("Enter the number of Frequency:");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}