import java.util.*;

public class floyds_triangle
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        int num = 1;

        for (int line = 1; line <= n; line++)
        {
            for (int j = 1; j <= line; j++)
            {

                System.out.print(num + " ");
                num++;

            }

            System.out.println();
        }

    }

}