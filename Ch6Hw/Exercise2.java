/**
 * Class:Exercise2
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.2.
 * @written on:11/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user roll of a six-sided die
 * */
package Ch6Hw;
import java.util.Random;
public class Exercise2 {
    public static void main(String[] args) {
        int[] dice2 = new int[6];
        Random random = new Random();


        for (int i = 0; i < dice2.length; i++) {

            dice2[i] = random.nextInt(6) + 1;
        }


        System.out.print("dice2 = ");
        for (int i = 0; i < dice2.length; i++) {
            System.out.print(dice2[i] + " ");
        }
    }
}
