package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan6.practice2;

public class QueueArray {
    int[] antrian;
    int array_size;
    int front;
    int rear;
    int jumlah_item;

    int n_item;

    void inisiasiUkuranQueue(int paramSIze) {
        antrian = new int[paramSIze];
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
        return (jumlah_item == array_size - 1);
    }

    int dequeue() {
        if (!isEmpty()) {

            int nilaiIndexArrayPertama = antrian[front];
            for (int i = 0; i < jumlah_item - 1; i++) {
                antrian[i] = antrian[i + 1];
            }
            rear--;
            jumlah_item--;
            return nilaiIndexArrayPertama;
        } else {
            System.out.println("Queue Kosong.");
            return rear;
        }
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Penuh!");
            antrian = resizing(antrian);
        } else {
            jumlah_item++;
            antrian[++rear] = data;
            n_item++;
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
