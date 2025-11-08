
class Logic
{
    void printTable(int num) 
    {
          int iCnt =0;
          int iTable =0;
     
            for(iCnt= 1 ; iCnt<= 10; iCnt++ )
            {
            iTable = num * iCnt;
            System.out.println( + iTable);
                
            }
    
    }


} 
class Program_5
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
        

    }
} 
      