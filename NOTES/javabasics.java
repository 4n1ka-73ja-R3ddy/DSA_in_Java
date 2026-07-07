import java.util.*;

public class javabasics
{

    public static void main(String args[])
    {
        // taking input from user

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(input);

        String fullname = sc.nextLine();
        System.out.println(fullname);

        // type promotion

        char a = 'a';
        char b = 'b';

        System.out.println((int) a);
        System.out.println(b);
        System.out.println(b - a);

        // switch case.

        System.out.println("enter 2 numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("enter the operator");

        char operator = sc.next().charAt(0);

        switch (operator)
        {

            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;

            case '%':
                System.out.println(num1 % num2);
                break;

            default:
                System.out.print("error !!!");

        }

    }

}