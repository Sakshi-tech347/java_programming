
class Logic 
{
    void CheckLeapYear(int year)
    {

        if ( year % 400 == 0)
        System.out.println("this is leap year ");

        else if( year % 100 == 0 )
        System.out.println("this is not leap year ");

        else if( year % 4 == 0 )
        System.out.println("this is  leap year ");

        else 
         System.out.println("this is not leap year ");
        

    }

}

class Program_1
{

    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);

    }


}
