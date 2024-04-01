package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice4;

public class Task {
    public static void main(String[] args) {

        TumpukanDariPPT operasi = new TumpukanDariPPT();

        operasi.inisialisasi(10);
        operasi.pushStack(5);
        operasi.pushStack(19);
        operasi.pushStack(20);
        operasi.pushStack(29);
        operasi.pushStack(80);
        operasi.pushStack(91);
        operasi.pushStack(50);
        operasi.pushStack(40);
        operasi.pushStack(34);
        operasi.pushStack(64);

        while (!operasi.isEmpty()) {
            int value = operasi.popStack();
            System.out.println("Nilai Ke-" +
                    (operasi.top + 2) +
                    " Bernilai: " + value
            );
        }
    }
}
