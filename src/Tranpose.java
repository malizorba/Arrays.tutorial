package Arrays;

public class Tranpose {
        public static void main(String[] args) {
            int[][] arr = { { 1, 6, 8 }, { 12, 5, 6 } };
            System.out.println("Matrix :");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j] + "    ");
                System.out.println();
            }
            System.out.println("Transpose :");
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr.length; j++)
                    System.out.print(arr[j][i] + "    ");
                System.out.println();
            }
        }
}
