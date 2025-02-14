package SetInterface;

import java.util.*;

public class SortedSet {
    public static void main(String[]args){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> sorted = new ArrayList<>(set1);
        Collections.sort(sorted);

        System.out.println(sorted);
    }
}
