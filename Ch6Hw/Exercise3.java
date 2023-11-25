/**
 * Class:Exercise3
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.3.
 * @written on:11/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user roll of a six-sided die,10 time adding each result to dice3
 * */
package Ch6Hw;
import java.util.Random;
import java.util.ArrayList;
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> dice3 = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {

            int roll = random.nextInt(6) + 1;
            dice3.add(roll);
        }


        System.out.print("dice3 = ");
        for (int value : dice3) {
            System.out.print(value + " ");
        }
    }
}
