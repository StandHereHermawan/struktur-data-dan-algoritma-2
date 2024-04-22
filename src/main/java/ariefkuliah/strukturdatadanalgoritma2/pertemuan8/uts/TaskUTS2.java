package ariefkuliah.strukturdatadanalgoritma2.pertemuan8.uts;

import java.util.ArrayDeque;

public class TaskUTS2 {
    /**
     * Mengisi Queue Sampai Penuh
     */
    public static void main(String[] args) {
        System.out.println("Task 2 Mempenuhkan Queue");

        QueueArrayUTS1 queue = new QueueArrayUTS1();
        queue.inisiasiUkuranQueue(6);

        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);

        while (!queue.isEmpty()) {
            System.out.println("Jumlah item: " + queue.jumlah_item +
                    ". ukuran antrian: " + queue.array_size +
                    ". Nilai n : " + queue.n_item +
                    ". Nilai : " + queue.dequeue());
        }
    }
}

class QueueArrayUTS1 {
    int[] antrian;
    int array_size;
    int front;
    int rear;
    int jumlah_item;
    int n_item;

    void inisiasiUkuranQueue(int paramSIze) {
        antrian = new int[paramSIze + 1];
        array_size = paramSIze;
        jumlah_item = 0;
        front = 0;
        rear = -1;
        n_item = 0;
    }

    boolean isEmpty() {
        return (jumlah_item == 0);
    }

    boolean isFull() {
        return (jumlah_item == array_size + 1);
    }

    int dequeue() {
        if (!isEmpty()) {

            int nilaiIndexArrayPertama = antrian[front];
            for (int i = 0; i < jumlah_item - 1; i++) {
                antrian[i] = antrian[i + 1];
            }
            rear--;
            jumlah_item--;
            n_item--;
            return nilaiIndexArrayPertama;
        } else {
            System.out.println("Queue Kosong.");
            return rear;
        }
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Penuh!");
            //antrian = resizing(antrian);
        } else {
            jumlah_item++;
            antrian[++rear] = data;
            n_item++;
            if ((antrian.length - 1) == jumlah_item) {
                System.out.println("Queue Penuh");
            }
        }
    }

    int[] resizing(int[] element) {
        int[] newArray = new int[2 * element.length];
        array_size = newArray.length;
        System.arraycopy(element, 0, newArray, 0, array_size);
        return newArray;
    }

    int peekQueue() {
        return antrian[front];
    }
}