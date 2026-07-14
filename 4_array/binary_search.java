import java.util.*;

public class binary_search {

    public static int search(int num[], int key) {

        int start = 0;
        int end = num.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String args[]) {

        int num[] = {2, 3, 4, 6, 7, 9};
        int key =17;

        int i = search(num, key);

        if (i == -1) {
            System.out.print("Not found");
        } else {
            System.out.print("Found at index " + i);
        }

    }

}