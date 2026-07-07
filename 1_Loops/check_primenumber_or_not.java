import java.util.*;

public class check_primenumber_or_not
{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        // we have optimised the code by using root(n)

        for (int i = 2; i < Math.sqrt(n); i++)
        {

            if (n % i == 0)
            {
                isPrime = false;
            }

        }

        if (isPrime == true)
        {
            System.out.println("N is Prime");
        }
        else
        {
            System.out.print("N is not Prime");
        }

    }

}