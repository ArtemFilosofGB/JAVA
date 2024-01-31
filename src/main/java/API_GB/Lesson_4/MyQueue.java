package API_GB.Lesson_4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();// first in - first our удалится 1й элемент(индекс 0)
        System.out.println("queue = " + queue);
        queue.add(5);
        System.out.println("queue = " + queue);


        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(0);
        pq.add(123);
        pq.add(13);
        pq.add(3);
        pq.add(1);
        System.out.println("pq = " + pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());//null
        System.out.println(pq.poll());//null
    }
}
