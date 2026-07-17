import java.util.*;

public class max_subarray_kadanes
{
    public static void kadanes(int num[])
    {

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++)
        {

            cs = cs + num[i];

            if (cs < 0)
            {
                cs = 0;
            }

            ms = Math.max(cs, ms);

        }

       /* this is for special case when all the numbers are -ve 
       
            ms=Integer.MIN_VALUE;
            for(int j=0;j<num.length;j++){
                ms=Math.max(ms,num[j]);

            }
        }
        */

        System.out.println("Max = " + ms);

    }

    public static void main(String args[])
    {

        int num[] = {0,0,0,0};

        kadanes(num);

    }

}