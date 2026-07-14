public class smallest_in_array
{

    
        public static int smallest(int num[])
        {

            int l = Integer.MAX_VALUE;

            for (int i = 0; i < num.length; i++)
            {

                if (l > num[i])
                {
                    l = num[i];
                }

            }

            return l;

        }

        public static void main(String args[])
        {

            int num[] = {2, 4, 3, 8, 5, 6};

            int l = smallest(num);

            System.out.println("smallest is " + l);

        }

    }

