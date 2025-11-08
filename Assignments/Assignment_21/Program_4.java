
class Logic 
{

void countFactor(int n)
{
    int i=0; int iCount = 0;

    for(i=1; i<=n ; i++)
    {
        if(n%i ==0)
        {
            iCount++;
            //System.out.print(+i);
        }
    }
     System.out.print("count of Factors of number" +iCount);
}

}






class Program_4
{
public static void main (String A [])
{

Logic lobj = new Logic();
lobj.countFactor(12);


}

}