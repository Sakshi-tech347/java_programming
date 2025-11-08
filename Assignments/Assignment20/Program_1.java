
class Logic
{

        void sumEvenNumber(int n)
        {
            int iSum =0;
            int i =0;

            for(i=1; i<=n ; i++)
            {
                if(i%2 == 0)
                {
                    iSum = i + iSum;
                }
                
            } 

        System.out.print("Sum of Even Number is:" +iSum);  
        }


}

class Program_1
{

        public static void main(String A[])
        {
            Logic lobj = new Logic();
            lobj.sumEvenNumber(10);

        }

}
