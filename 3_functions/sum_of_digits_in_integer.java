import java.util.*;

public class sum_of_digits_in_integer
{
    public static void sum(int n)
    {

        int sum = 0;
        int rem = 0;

        while (n > 0)
        {

            rem = n % 10;
            sum = sum + rem;

            n = n / 10;
        }

        System.out.println("The sum of digits is: " + sum);

    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        sum(n);

    }

    sc.close()

}