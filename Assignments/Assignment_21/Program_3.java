
class Logic 
{

void DisplayFactor(int n)
{
    int i=0;

    for(i=1; i<=n ; i++)
    {
        if(n%i ==0)
        {
            System.out.print(+i);
        }
    }
     
}

}






class Program_3
{
public static void main (String A [])
{

Logic lobj = new Logic();
lobj.DisplayFactor(12);


}

}