
class Logic 
{

void PrintDivisibleBy2And3(int n)
{
    if(((n%2) == 0) && ((n%3) == 0))
    {
        System.out.println("number iS Divisible by 2 and 3 ");

    }
    else
    {
        System.out.println("number iS not  Divisible by 2 and 3 ");

    }
}

}






class Program_5
{
public static void main (String A [])
{

Logic lobj = new Logic();
lobj.PrintDivisibleBy2And3(30);


}

}