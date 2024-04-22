package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan6.practice3;

import java.util.ArrayDeque;
import java.util.Queue;

public class ContohQueueDariPackageUtilJava {
    public static void main(String[] args) {
        Queue<String> deque = new ArrayDeque<>();

        deque.offer("Arief");
        deque.offer("Erlang");
        deque.offer("Fatan");
        deque.offer("Hilmi");

        while (!deque.isEmpty()){
            System.out.println(
                    "Ukuran queue: " + deque.size() + ". " + deque.poll() +
                            ". ukuran queue setelah pop: " + deque.size());
        }

        /**
        for (String next = deque.poll(); next != null; next = deque.poll()) {
            System.out.println(
                    "Ukuran queue: " + deque.size() + ". " + next +
                            ". ukuran queue setelah pop: " + deque.size());
        }
        */
    }
}
