/**
 * Class:Exercise4
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.4.
 * @written on:11/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user roll of a six-sided die 5 times, adding each result to dice4
 * */
package Ch6Hw;
import java.util.ArrayList;
import java.util.Random;
public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> dice4 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int roll = random.nextInt(6) + 1;
            dice4.add(roll);
        }

        System.out.print("dice4 = ");
        for (int value : dice4) {
            System.out.print(value + " ");
        }
    }
}
