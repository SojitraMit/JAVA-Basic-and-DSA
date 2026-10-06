import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DecreasingOrder {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
