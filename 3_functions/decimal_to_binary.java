import java.util.*;

public class decimal_to_binary
{
    public static int convertion(int n)
    {

        int pow = 0;
        int binNum = 0;

        while (n > 0)
        {
            int rem = n % 2;

            binNum = binNum + (int) (rem * Math.pow(10, pow));
            n = n / 2;
            pow++;

        }

        return binNum;

    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the decimal number");

        int deci = sc.nextInt();

        int binary_num = convertion(deci);

        System.out.println("Binary number is : " + binary_num);

    }

}