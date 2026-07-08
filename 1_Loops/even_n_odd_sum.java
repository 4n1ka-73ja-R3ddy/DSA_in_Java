import java.util.*;

public class even_n_odd_sum
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;
        int count = 1;

        do
        {
            System.out.print("Enter a number");
            int n = sc.nextInt();

            if (n % 2 == 0)
            {
                evensum = evensum + n;
            }
            else
            {
                oddsum = oddsum + n;
            }

            System.out.println("Do you want to exit? Press 0 for exit and 1 to enter again.");

            count = sc.nextInt();

        }
        while (count == 1);

        System.out.println("Even sum " + evensum);
        System.out.println("Odd sum " + oddsum);

    }

}