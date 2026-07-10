import java.util.*;

public class butterfly
{
    public static void pattern(int n)
    {

        // top half of the butterfly

        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }

        // bottom half of the butterfly

        for (int i = n; i >= 1; i--)
        {

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines");
        int n = sc.nextInt();

        pattern(n);

    }

}