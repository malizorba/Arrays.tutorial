package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameofGuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("How many right do you want");
        int right=input.nextInt();
        int [] wrong= new int[right];
        boolean isWin=false;




        while (right !=0){
            System.out.print("Please enter your guess :" );
            int selected = input.nextInt();
           if (selected<0 || selected>99){
               System.out.println("Please enter number which is between 100 and 0");

           }

            if (selected==number){
                System.out.println("Congrats your guess is true :"+selected);
                isWin=true;
                break;
            }else {
                right--;
                wrong[right]=selected;


                System.out.println("Your guess is false");
                if (selected>number){
                    System.out.println("Your guess is higher than number");
                }else {
                    System.out.println("Your guess is lower than number");
                }
                System.out.println("your remain right is :"+(right));


            }

        }
        if (!isWin){
            System.out.println("True number was :"+number);
            System.out.println("Your Guess  :"+Arrays.toString(wrong));

        }



    }
}
