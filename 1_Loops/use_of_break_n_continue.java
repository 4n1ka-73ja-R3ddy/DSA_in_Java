public class use_of_break_n_continue
{
    public static void main(String args[])
    {
        // using break
        // exit when we reach the number 5

        System.out.println("USE OF BREAK");

        for (int i = 1; i < 10; i++)
        {

            if (i % 5 == 0)
            {
                break;
            }

            System.out.println(i);

        }

        // use of continue statement is the skip an iteration
        // skipping even numbers

        System.out.println("USE OF CONTINUE");

        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                continue;
            }

            System.out.println(i);

        }

    }

}