package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.array_multidimension.practice_4;

public class Practice {
    public static void main(String[] args) {
        /**
         * Deklarasi dan inisialisasi array pertama
         * */
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /**
         * Deklarasi dan inisialisasi array kedua
         * */
        int[][] array2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        /**
         * Deklarasi dan inisialisasi array hasil penjumlahan
         * */
        int[][] hasil = new int[3][3];

        /**
         * Melakukan penjumlahan dan menyimpan hasilnya di array 'hasil'
         * */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = array1[i][j] + array2[i][j];
            }
        }

        /**
         * Menampilkan hasil penjumlahan.
         * */
        System.out.println("Hasil Penjumlahan:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}