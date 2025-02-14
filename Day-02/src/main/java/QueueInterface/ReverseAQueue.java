package QueueInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseAQueue {
    public static void main(String[]args){
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);

        Collections.reverse((List<?>) que);
        System.out.println(que);
    }
}
