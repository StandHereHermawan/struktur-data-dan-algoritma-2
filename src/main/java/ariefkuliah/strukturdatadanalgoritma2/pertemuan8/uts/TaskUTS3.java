package ariefkuliah.strukturdatadanalgoritma2.pertemuan8.uts;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskUTS3 {
    /**
     * Ngosongin Queue sampai Kosong
     * */
    public static void main(String[] args) {
        Queue<String> deque = new ArrayDeque<>();
        deque.add("Arief");
        deque.add("Erlang");
        deque.add("Fatan");
        deque.add("Hilmi");

        System.out.println("Task 3 Mengosongkan Isi Queue");
        while(!deque.isEmpty()){
            System.out.println("nama: " + deque.poll());
        }
        System.out.println("Queue Kosong");
    }
}