import java.util.*;

public class palindrome
{
    public static void check_palindrome(int p)
    {

        int n = p;
        int rev = 0;
        int pow = 0;

        while (n > 0)
        {
            int rem = n % 10;

            rev = rev * 10 + rem;

            pow++;
            n = n / 10;

        }

        if (p == rev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }

    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers");

        int p = sc.nextInt();

        check_palindrome(p);

    }

}