package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan6.practice4.struktur_data;

public class Antrian {

    int antrian[];
    int ukuran_array;
    int front;
    int rear;
    int jumlah_item;

    void inisiasi(int arrayValue) {
        ukuran_array = arrayValue;
        antrian = new int[arrayValue];
        jumlah_item = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        if (jumlah_item == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (jumlah_item == ukuran_array) {
            return true;
        } else {
            return false;
        }
    }

    int remove() {
        if (!isEmpty()) {
            int nilaiPertama = antrian[front];
            for (int i = 0; i < jumlah_item - 1; i++) {
                antrian[i] = antrian[i + 1];
            }
            rear--;
            jumlah_item--;
            return nilaiPertama;
        } else {
            System.out.println("Queue Kosong");
            return rear;
        }
    }

    void add(int data) {
        if (isFull()) {
            System.out.println("Queue Penuh");
            antrian = resizing(antrian);
        }
        jumlah_item++;
        rear++;
        antrian[rear] = data;
    }

    int[] resizing(int[] element) {
        int[] new_array = new int[(2 * element.length)];
        ukuran_array = new_array.length;
        System.arraycopy(element, 0, new_array, 0, ukuran_array);
        return new_array;
    }

    int peekQueue() {
        return antrian[front];
    }
}
