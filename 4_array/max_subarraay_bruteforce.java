import java.util.*;

/*
import java.util.*;

public class ArraysCC
{

    public static void maxSubarraySum(int numbers[])
    {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++)
        {

            int start = i;

            for (int j = i; j < numbers.length; j++)
            {

                int end = j;
                int currSum = 0;

                for (int k = start; k <= end; k++)
                {

                    currSum = currSum + numbers[k];

                }

                System.out.println(currSum);

                if (maxSum < currSum)
                {

                    maxSum = currSum;

                }

            }

        }

        System.out.println("Max sum = " + maxSum);

    }

    public static void main(String args[])
    {

        int numbers[] = {2, 4, 6, 8, 10};

        maxSubarraySum(numbers);

    }

}
*/

public class max_subarraay_bruteforce
{

    public static void max_subarray(int num[])
    {

        int largest = Integer.MIN_VALUE;
        int sum;

        for (int i = 0; i < num.length; i++)
        {

            for (int j = i; j < num.length; j++)
            {

                sum = 0;

                System.out.print("( ");

                for (int k = i; k <= j; k++)
                {

                    System.out.print(num[k] + " ");

                    sum += num[k];

                }

                System.out.print(")    ");

                if (largest < sum)
                {
                    largest = sum;
                }

            }

            System.out.println();

        }

        System.out.println("Largest subarray sum is " + largest);

    }

    public static void main(String args[])
    {

      //  int num[] = {1,-3,2,-4,6,-2,8};
        int num[] = {1,-2,6,-1,3};

        max_subarray(num);

    }

}