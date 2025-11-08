
class Logic 
{
    void DisplayGrade(int marks)
    {

        if (marks >= 90 )
        {
            System.out.println("Grade A");
        }
        
        else if(marks >= 80 )
        {
            System.out.println("Grade B");
        }

        else if(marks >= 70 )
        {
            System.out.println("Grade C");
        }

        else if(marks >= 60 )
        {
            System.out.println("Grade D");
        }

        else 
        {
            System.out.println("Grade E");
        }
    }
}

class Program_2
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(87);

    }
}