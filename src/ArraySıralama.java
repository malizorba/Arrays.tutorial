package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public  class ArraySıralama {
    public static void main(String[] args) {
        int n;

        System.out.print("Please enter length of array :");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();

        int [] list = new int [n];
        System.out.println("Please enter list of entry");
        for (int i= 0; i< list.length;i++){
            System.out.print(i+1+". enter entry");
            list[i]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
