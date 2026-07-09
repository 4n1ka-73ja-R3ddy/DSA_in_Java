import java.util.*;

public class binary_to_decimal {

    public static int binary_to_decimal_convertion(int b) {
        int power = 0;
        int d = 0;

        while (b > 0) {
            int rem = b % 10;

            d = d + (int)(Math.pow(2, power) * rem);

            power++;
            b = b / 10;
        }

        return d;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary value");
        int b = sc.nextInt();

        int decimal = binary_to_decimal_convertion(b);

        System.out.println("decimal value is " + decimal);
    }
}