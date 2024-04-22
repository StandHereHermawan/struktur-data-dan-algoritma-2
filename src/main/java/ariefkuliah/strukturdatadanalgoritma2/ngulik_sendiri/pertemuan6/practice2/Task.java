package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan6.practice2;

public class Task {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray();
        queueArray.inisiasiUkuranQueue(15);

        queueArray.enqueue(10);
        queueArray.enqueue(11);
        queueArray.enqueue(12);
        queueArray.enqueue(13);
        queueArray.enqueue(14);

        queueArray.enqueue(15);
        queueArray.enqueue(16);
        queueArray.enqueue(17);
        queueArray.enqueue(18);
        queueArray.enqueue(19);

        queueArray.enqueue(20);
        queueArray.enqueue(21);
        queueArray.enqueue(22);
        queueArray.enqueue(23);
        queueArray.enqueue(24);

        for (int i = 0; i < queueArray.array_size - 1; i++) {
            if (queueArray.jumlah_item != 1) {
                System.out.println(
                        "Jumlah Item adalah " + queueArray.jumlah_item + ". " +
                                "Nilai Index Pertama adalah " + queueArray.peekQueue() + ". " +
                                "Index " + queueArray.front + " Diambil. " +
                                "Nilai Yang Diambil: " + queueArray.dequeue() + ". " +
                                "Index Terakhir" + " Memiliki Nilai " + queueArray.antrian[queueArray.rear] + ". " +
                                "Index " + queueArray.front + " Memiliki Nilai " + queueArray.peekQueue()
                );
            } else {
                System.out.println(
                        "Jumlah Item adalah " + queueArray.jumlah_item + ". " +
                                "Nilai Index Pertama adalah " + queueArray.peekQueue() + ". " +
                                "Index " + queueArray.front + " Diambil. " +
                                "Nilai Yang Diambil: " + queueArray.dequeue() + ". " +
                                "Index Terakhir" + " Memiliki Nilai " + queueArray.peekQueue() + ". " +
                                "Index " + queueArray.front + " Memiliki Nilai " + queueArray.peekQueue()
                );
            }
        }
    }
}
