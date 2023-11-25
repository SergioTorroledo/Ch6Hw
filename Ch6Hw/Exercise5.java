/**
 * Class:Exercise5
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:6.8.5.
 * @written on:11/24/2023
 * Course:ITEC 2140-13 Saturday
 * This class created a new Arraylist that contains only the items that occurs in both list.
 * */
package Ch6Hw;
import java.util.ArrayList;
import java.util.Arrays;
public class Exercise5 {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        ArrayList<Integer> intersection = new ArrayList<>();

        Arrays.sort(list1);
        Arrays.sort(list2);

        int i = 0, j = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] == list2[j]) {

                if (intersection.isEmpty() || list1[i] != intersection.get(intersection.size() - 1)) {
                    intersection.add(list1[i]);
                }
                i++;
                j++;
            } else if (list1[i] < list2[j]) {
                i++;
            } else {
                j++;
            }
        }


        System.out.println( intersection);
    }
}
