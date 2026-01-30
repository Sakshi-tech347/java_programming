import java.io.File;
import java.util.*;



class Program1
    {
        public static void main(String A[])throws Exception
        {
            Scanner sobj = new Scanner(System.in);
            String FileName = null;
            File fobj = null;
            boolean bRet = false; 

            System.out.println("Enter a File Name :");
            FileName = sobj.nextLine();
            
            fobj = new File (FileName);

            bRet = fobj.exists();
            if(bRet == true)
                {
                    System.out.println("File open Succefully");
                }
                else 
                {
                    System.out.println(" Unable to open File Because There is No File ");

                }
           
           
        }
        
    }
