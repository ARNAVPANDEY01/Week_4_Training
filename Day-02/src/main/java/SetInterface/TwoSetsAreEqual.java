package SetInterface;

import java.util.*;

public class TwoSetsAreEqual {
    public static boolean hashSet(Set<Integer> st1, Set<Integer> st2) {
        return st1.equals(st2);
    }

    public static void main(String[]args){
        Set<Integer> st1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> st2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Are sets equals:" + hashSet(st1, st2));
    }

}
