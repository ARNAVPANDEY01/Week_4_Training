//Q-5
//Find Subsets
//Check if one set is a subset of another.
//Example:
//Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
package SetInterface;

import java.util.*;

public class FindSubsets {
    public static boolean findsets(Set<Integer> set1, Set<Integer> set2){
        return set2.containsAll(set1);
    }

    public static void main(String[]args){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));

        System.out.println(findsets(set1, set2));

    }
}
