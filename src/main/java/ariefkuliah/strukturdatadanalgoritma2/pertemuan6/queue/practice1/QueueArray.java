package ariefkuliah.strukturdatadanalgoritma2.pertemuan6.queue.practice1;

public class QueueArray {
    int[] antrian;
    int array_size;
    int front, rear;
    int jumlah_item;

    void inisiasi(int arrSize){
        array_size = arrSize;
        antrian = new int[arrSize];
        jumlah_item = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty(){
        return (jumlah_item == 0);
    }

    boolean isFull(){
        return (jumlah_item == array_size - 1);
    }

    int dequeue(){
        if (!isEmpty()){
            int temp = antrian[front];
            for (int i = 0; i < jumlah_item - 1; i++) {
                antrian[i] = antrian[i + 1];
            }
            rear--;
            jumlah_item--;
            return temp;
        } else {
            System.out.println("Queue Kosong.");
            return rear;
        }
    }

    void enqueue(int data){
        if (isFull()){
            System.out.println("Queue Penuh!");
            antrian = resizing(antrian);
        } else {
            jumlah_item++;
            antrian[++rear] = data;
        }
    }

    int[] resizing(int[] element){
        int[] newArr = new int[2 * element.length];
        array_size = newArr.length;
        System.arraycopy(element, 0, newArr, 0, array_size);
        return newArr;
    }

    int peekQueue(){
        return antrian[front];
    }
}
