
class Logic 
{

void ProductOfDigit(int n)
{

int iDigit = 0, iProduct =1;

while (n !=0)
{
    iDigit = n % 10 ;
    System.out.println(+iDigit);
    iProduct =iProduct *iDigit ; 
    n = n/10;
}


System.out.println("product of Digit is:" +iProduct);
}

}

class Program_1
{
public static void main (String A [])
{

Logic lobj = new Logic();
lobj.ProductOfDigit(234);

}

}
