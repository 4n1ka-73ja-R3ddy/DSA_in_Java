import java.util.*;

public class print_subarrays {

    public static void printpairs(int num[]) {

       for (int i = 0; i < num.length; i++) {

    int start = i;

    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for (int j = i; j < num.length; j++) {

        int end = j;
        int subsum = 0;

        for (int k = start; k <= end; k++) {

            subsum += num[k];
            System.out.print(num[k] + " ");
        }

        if (subsum > largest) {
            largest = subsum;
        }

        if (subsum < smallest) {
            smallest = subsum;
        }

        System.out.print("  ");
    }

    System.out.print("min = " + smallest + "  max = " + largest);
    System.out.println();
}
}

    public static void main(String args[]) {

        int num[] = {2, 4, 6, 8, 10, 12};

        printpairs(num);
    }
}