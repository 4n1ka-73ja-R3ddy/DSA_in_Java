import java.util.*;

public class largest_in_array
{
    public static int largest(int num[])
    {

        int l = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++)
        {

            if (l < num[i])
            {
                l = num[i];
            }

        }

        return l;

    }

    public static void main(String args[])
    {

        int num[] = {2, 4, 3, 8, 5, 6};

        int l = largest(num);

        System.out.println("Largest is " + l);

    }

}