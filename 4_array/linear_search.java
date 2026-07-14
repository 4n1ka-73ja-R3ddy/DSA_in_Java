import java.util.*;

public class linear_search
{
    public static int search(int numbers[], int key)
    {

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == key)
            {
                return i;
            }

        }

        return -1;

    }

    public static int search(String menu[], String key2)
    {

        for (int i = 0; i < menu.length; i++)
        {
            if (menu[i] == key2)
            {
                return i;
            }

        }

        return -1;

    }

    public static void main(String args[])
    {

        int numbers[] = {12, 32, 43, 5, 51, 6, 23, 8, 9, 67, 76};

        String menu[] = {"samosa", "cake", "pizza"};
        String key2 = "cake";

        int key = 8;

        int result = search(menu, key2);

        if (result == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("The index of the key is " + result);
        }

    }

}