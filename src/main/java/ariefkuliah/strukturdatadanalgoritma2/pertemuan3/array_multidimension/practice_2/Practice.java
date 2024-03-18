package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.array_multidimension.practice_2;

import java.util.Scanner;

public class Practice {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Deklarasi array 2 dimensi dengan ukuran 2x3.
         * */
        int[][] array2d = new int[2][3];

        System.out.println("Masukkan nilai untuk array 2 dimensi (2x3): ");

        /**
         * Meminta pengguna untuk memasukkan nilai untuk setiap elemen array.
         * */
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print("Masukkan nilai untuk elemen ["+ i +"]["+ j +"]: ");
                array2d[i][j] = SCANNER.nextInt();
            }
        }
        SCANNER.close();

        System.out.println();
        System.out.println("Array 2 dimensi yang dimasukkan:");
        System.out.println();

        /**
         * Mencetak Array2D
         * */
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + "    ");
            }
            System.out.print("\n" + "\n");
            /**
             * Mencetak baris baru setelah mencetak semua elemen dalam satu baris.
             * */
        }
    }
}
