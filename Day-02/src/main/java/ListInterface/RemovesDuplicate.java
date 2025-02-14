package ListInterface;

import java.util.*;

public class RemovesDuplicate {
    public static <T> List<T> removeDuplicates(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        // Sample input list
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Remove duplicates while maintaining order
        List<Integer> uniqueList = removeDuplicates(numbers);

        // Display the result
        System.out.println("Original List: " + numbers);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}

