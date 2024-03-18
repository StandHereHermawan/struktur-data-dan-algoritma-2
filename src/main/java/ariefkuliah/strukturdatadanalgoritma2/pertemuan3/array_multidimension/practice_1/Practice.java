package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.array_multidimension.practice_1;

public class Practice {
    public static void main(String[] args) {

        /**
         * Mendefinisikan Array 2 dimensi dengan ukuran 2 x 3 secara hardcode.
         * */
        int[][] array2d = new int[2][3];

        /**
         * Mengisi array 2 dimensi dengan nilai secara hardcode.
         * */
        array2d[0][0] = 1;
        array2d[0][1] = 2;
        array2d[0][2] = 3;
        array2d[1][0] = 4;
        array2d[1][1] = 5;
        array2d[1][2] = 6;

        /**
         * Menampilkan nilai dari array 2 dimensi menggunakan nested for i loop.
         * */
        System.out.println("Array 2 dimensi berikut:");
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + "    "); // 4 spasi
            }
            System.out.print("\n" + "\n");
        }
    }
}
