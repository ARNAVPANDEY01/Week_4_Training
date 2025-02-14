//Q-3
//Rotate Elements in a List
//Rotate the elements of a list by a given number of positions.
//Example:
//Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
package ListInterface;

import java.util.*;

public class RotateElementsList {
    public static <T> List<T> rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        List<T> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(k, n)); // Add second half
        rotatedList.addAll(list.subList(0, k)); // Add first half

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        List<Integer> rotated = rotateList(numbers, rotateBy);

        System.out.println("Original List: " + numbers);
        System.out.println("Rotated List: " + rotated);
    }
}
















