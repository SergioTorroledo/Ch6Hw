/**
 * Class:Exercise8
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.8.
 * @written on:11/25/2023
 * Course:ITEC 2140-13 Saturday
 * This class determine if the centennial is present.
 * sources:https://www.geeksforgeeks.org/java-time-localdate-class-in-java/
 * */
package Ch6Hw;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));


        boolean isCentennialPresent = centennials.contains(LocalDate.of(1876, Month.JULY, 4));


        System.out.println("centennial present = " + isCentennialPresent);
    }
}
