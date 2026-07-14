import java.util.*;

public class reverse_array
{

    public static void swap(int num[])
    {

        int first = 0;
        int last = num.length - 1;

        while (first < last)
        {

            int temp = num[first];
            num[first] = num[last];
            num[last] = num[temp];

            first++;
            last--;

        }

    }

    public static void main(String args[])
    {

        int num[] = {1, 2, 3, 4, 5, 6};

        swap(num);

        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }

    }

}