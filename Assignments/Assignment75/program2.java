import java.util.*; 
class program2 
{
    public static void main(String A[])
    {

        int  Age  = 0;
        int Monthly_income = 0;
        int Credit_Score = 0;
        String unpaidLoan = null;
        String  Reason = "";
        Scanner sobj = new Scanner(System.in);
        System.out.println("Entter your Age  :");
        Age = sobj.nextInt();

        System.out.println("Entter Your Income   :");
        Monthly_income = sobj.nextInt();

        System.out.println("Entter your Credit Score :");
        Credit_Score= sobj.nextInt();

        System.out.println(" Do You have any existing any unpaid loan  :  (Yes or No)");
        unpaidLoan= sobj.next();

       
        if(Age <= 0||
            Credit_Score <= 0 ||
            Monthly_income<= 0 ||
            (unpaidLoan.equalsIgnoreCase("Yes") == false)  &&
            (unpaidLoan.equalsIgnoreCase("No") == false)  

        )
            {
                System.out.println(" Invalid output");
                sobj.close();
                return;
            
            }

        if((Age < 21 || Age > 60) )
            {
                
            Reason =  Reason +("Loan Rejected : Age is not satisfied\n");
            
        
                
            }
        if(Monthly_income < 25000)
            {
                Reason = Reason +("Loan Rejected : Monthly income lower than 25,000 \n");


            }
        if( Credit_Score < 700 )
            {
                Reason = Reason + ("Loan Rejected : Credit Score is lower 700 \n");
            }
            
        if((unpaidLoan.equalsIgnoreCase("Yes")))
            {
                Reason = Reason + ("Loan Rejected :  you have unpaid loan  \n");
            } 
            
            if( Reason.equals("") )
                {
                    System.out.println("loan approved");

                }
            else
                {
                    System.out.println(Reason);

                }
         

                sobj.close();
    }    
}
