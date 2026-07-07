
import java.util.*;

public class reverse_a_number
{
    public static void main(String args[])
    {

        // reversing a number

        int n = 10899;

        while (n > 0)
        {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();


        // reversing the given number and store in a variable
        int rev=0;
        int x=180976;
        while (x> 0)
        {
            int lastdigit = x % 10;
             rev = (rev * 10) + lastdigit;
            x = x / 10;
        }

        System.out.print("the reversed number is " + rev);

    }
}