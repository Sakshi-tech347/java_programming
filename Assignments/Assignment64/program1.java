import java.util.*;
 // 0000     0000    0000    0000    0400    0000    0000    0000
class program1
{

    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in); 
        int iNo =0,iMask = 0,iResult= 0;

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00004000;
        iResult =  iNo & iMask ;

        if(iResult == iMask)
            {
                System.out.println("15 th bit is ON");
            }
        else
            {
                System.out.println("15 th bit is OF");
 
            }

    }
}
