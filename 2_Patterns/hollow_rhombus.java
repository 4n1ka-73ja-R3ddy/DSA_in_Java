import java.util.*;

public class hollow_rhombus
{

    /*
    Alternate Code:

    // Print Hollow Rhombus
    for (int i = 1; i <= n; i++)
    {

        // Print leading spaces
        for (int j = 1; j <= (n - i); j++)
        {
            System.out.print(" ");
        }

        // Print hollow rectangle using stars
        for (int j = 1; j <= n; j++)
        {

            // Print '*' only on the border
            if (i == 1 || i == n || j == 1 || j == n)
            {
                System.out.print("*");
            }
            else
            {
                // Print space inside the rhombus
                System.out.print(" ");
            }

        }

        System.out.println();

    }
    */

    public static void pattern(int n)
    {

        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++)
            {

                if (i == 1 || i == n)
                {

                    System.out.print("*");

                }

                if (j + i == n + 1 && i != 1 && i != n)
                {

                    System.out.print("*");

                    for (int k = 1; k <= n - 1; k++)
                    {
                        System.out.print(" ");
                    }

                    System.out.print("*");

                }

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