
class Logic 
{

void CountEvenOddRange(int n)
{
    int i=0, iCountEven =0, iCountOdd =0;

    for(i=1; i<=n ; i++)
    {
        if(i%2 ==0 )
        {
            //System.out.println("Even number is "+ i);
            iCountEven++;
        }
        else if (i != 0)
        {
            //System.out.println("odd number is "+ i);
            iCountOdd++;
        }

       



    }
        System.out.println("count of Even number is" +iCountEven);
        System.out.println("count of Odd number is " +iCountOdd);

}

}






class Program_2
{
public static void main (String A [])
{

Logic lobj = new Logic();
lobj.CountEvenOddRange(25);


}

}