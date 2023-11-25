/**
 * Class:Exercise1
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.1.
 * @written on:11/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user roll of a six-sided die
 * */

package Ch6Hw;
import java.util.Random;
public class Exercise1 {
    public static void main(String[] args) {
        int[] dice1 = new int[10];
        Random random = new Random();


        for (int i = 0; i < dice1.length; i++) {

            dice1[i] = random.nextInt(6) + 1;
        }


        System.out.print("dice1 = ");
        for (int value : dice1) {
            System.out.print(value + " ");
        }
    }
}
