/**
 * Class:Exercise6
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.6.
 * @written on:11/24/2023
 * Course:ITEC 2140-13 Saturday
 * This class fix the mistake of date 1900
 * sources:https://www.geeksforgeeks.org/java-time-localdate-class-in-java/
 * */
package Ch6Hw;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));


        System.out.println("Before removal:");
        printDates(centennials);


        centennials.removeIf(date -> date.getYear() == 1900);


        System.out.println("\nAfter removal:");
        printDates(centennials);
    }


    private static void printDates(ArrayList<LocalDate> dates) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (LocalDate date : dates) {
            System.out.println(date.format(formatter));
        }
        System.out.println("size = " + dates.size());
    }
}
