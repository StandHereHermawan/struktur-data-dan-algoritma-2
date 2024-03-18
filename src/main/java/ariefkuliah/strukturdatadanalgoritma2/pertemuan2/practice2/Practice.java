package ariefkuliah.strukturdatadanalgoritma2.pertemuan2.practice2;

import java.util.Scanner;

public class Practice {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan ukuran maksimum Lurik = ");

        /**
         * Untuk menentukan ukuran maksimal Lurik
         * */
        int maximumIndex = scanner.nextInt();

        /**
         * Deklarasi untuk jumlah total nilai lurik
         * */
        int summary = 0;

        /**
         * Deklarasi Lurik untuk menyimpan angka hasil input konsol terminal
         * */
        int[] values = new int[maximumIndex];
        System.out.println();

        /**
         * Proses mnedapatkan nilai per index lurik sesuai yang diinput dari konsol terminal
         * */
        for (int i = 0; i < maximumIndex; i++) {
            System.out.print("Masukkan Nilai ke " + (i + 1) + " = ");
            values[i] = scanner.nextInt();
            summary = values[i] + summary;


        }

        /**
         * Deklarasi untuk Mencari nilai rata-rata seluruh isi dari Lurik values
         * */
        float average = (float) summary / maximumIndex;

        System.out.println("Jumlah Nilai adalah = " + summary);
        System.out.println("Jumlah Rata-Rata Nilai adalah = " + average);
    }
}
