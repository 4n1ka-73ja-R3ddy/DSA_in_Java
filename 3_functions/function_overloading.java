import java.util.*;

// function overloading can happen with different datatypes or parameter or different number of parameters but not the difference in the return type.

public class function_overloading
{

    // different number of parameters

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    // different datatypes of parameters

    public static int product(int a, int b)
    {
        return a * b;
    }

    public static float product(float a, float b)
    {
        return a * b;
    }

    public static void main(String args[])
    {

        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 5));
        System.out.println(product(3, 4));

        System.out.println(product(3.3f, 4.4f));

    }

}