package ariefkuliah.strukturdatadanalgoritma2.pertemuan2.practice3;

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

        int maximum = 0;
        int minimum = 0;
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

            if (maximum < values[i]) {
                maximum = values[i];
            }

            if (minimum == 0) {
                minimum = values[i];
            }

            if (minimum > values[i]){
                minimum = values[i];
            }

        }

        /**
         * Deklarasi untuk Mencari nilai rata-rata seluruh isi dari Lurik values
         * */
        float average = (float) summary / maximumIndex;

        System.out.println("Jumlah Nilai adalah = " + summary);
        System.out.println("Jumlah Rata-Rata Nilai adalah = " + average);
        System.out.println("Nilai Maksimum dari Lurik yang di input = " + maximum);
        System.out.println("Nilai Minimum dari Lurik yang di input = " + minimum);

        System.out.print("Masukkan index nilai yang akan dicari = ");
        int indexValue = scanner.nextInt();

        if (indexValue < values.length) {
            System.out.println("Nilai sesuai index = " + indexValue + " adalah " + values[indexValue]);
        } else if (indexValue < 0) {
            System.out.println("index yang di input tidak ada nilai-nya.");
        } else {
            System.out.println("index yang di input tidak ada nilai-nya.");
        }
    }
}
