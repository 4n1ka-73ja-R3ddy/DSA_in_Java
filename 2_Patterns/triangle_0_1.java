import java.util.*;

public class triangle_0_1
{
    public static void pattern(int n)
    {

        int rem = 0;

        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= i; j++)
            {

                rem = (i + j + 1) % 2;

                System.out.print(rem + " ");

                /*
                  We can use this method also.
                 
                  We can observe that whenever i + j is even, we need to print 1.
                  Whenever it is odd, we will print 0.
                 
                  So,
                 
                  if ((i + j) % 2 == 0)
                  {
                      System.out.print("1");
                  }
                  else
                  {
                      System.out.print("0");
                  }
                 */

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