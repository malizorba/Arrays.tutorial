package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class FindingClosestValue {
    public static void main(String[] args) {
        int[] list = {21, 25, 269, -7, -1, 321, 2, 0,9};
        Scanner scan = new Scanner(System.in);

        Arrays.sort(list);

        System.out.println("List : " + Arrays.toString(list));
        System.out.print("Value of entered : ");
        int value = scan.nextInt();

        int min = list[0];
        int max = list[8];

        for (int i : list) {
            if (i < value) {
                min = i;
            }
        }


        for (int j : list) {
            if (j > value) {
                max = j;
                break;
            }
        }
        System.out.println("Min Closest Value: " + min);
        System.out.println("GMax Closest Value: " + max);

    }
}



