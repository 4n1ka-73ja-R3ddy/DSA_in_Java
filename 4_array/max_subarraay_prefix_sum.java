import java.util.*;

public class max_subarraay_prefix_sum
{
    public static void max_subarray(int num[])
    {

        int prefix[] = new int[num.length];

        for (int i = 1; i < num.length; i++)
        {

            prefix[0] = num[0];

            prefix[i] = prefix[i - 1] + num[i];

        }

        int sum = 0;
        int largest = Integer.MIN_VALUE;

        /*
        In the below loop, I will start from 1 and not 0. Do a dry run.

        If i starts from 0, then i - 1 = -1, which is out of bounds.
        */

        for (int i = 1; i < prefix.length; i++)
        {

            for (int j = i; j < num.length; j++)
            {

                sum = prefix[j] - prefix[i - 1];

            }

            if (largest < sum)
            {
                largest = sum;
            }

        }

        System.out.print("Largest " + largest);

    }

    public static void main(String args[])
    {

        int num[] = {1, -2, 6, -1, 3};

        max_subarray(num);

    }

}