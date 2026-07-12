import java.util.*;

public class palindromic_pyramid
{
    public static void pattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            // Print spaces
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }

            // Print numbers in increasing order
            for (int j = 2; j <= i; j++)
            {
                System.out.print(j);
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

        sc.close();
    }
}