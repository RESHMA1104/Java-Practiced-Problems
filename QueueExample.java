import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> ad = new ArrayDeque<>();
        ad.offer("A");
        ad.offer("B");
        ad.poll();
        ad.offer("C");
        ad.offer("D");
        ad.remove();
        System.out.println(ad);
    }
}