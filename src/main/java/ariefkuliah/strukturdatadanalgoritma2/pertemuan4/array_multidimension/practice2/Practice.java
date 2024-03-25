package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.array_multidimension.practice2;

public class Practice {
    public static void main(String[] args) {

        /**
         * Mendefinisikan array 4 dimensi
         * */
        int[][][][] array4d = {
                {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}},
                {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}
        };

        /**
         * Akses elemen array 4 dimensi
         * */
        System.out.println("Nilai dari array4d[0][0][0][0]: " + array4d[0][0][0][0]); // Output: 1;
        System.out.println("Nilai dari array4d[1][1][0][0]: " + array4d[1][1][0][0]); // Output: 13:
    }
}
