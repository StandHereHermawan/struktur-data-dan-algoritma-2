package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.array_multidimension.practice1;

public class Practice {
    public static void main(String[] args) {

        /**
         * Mendefinisikan array 3 dimensi
         * */
        int[][][] array3d = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
        };

        /**
         * Akses elemen Array hardcoded
         * */
        System.out.println("Nilai dari array3d[0][0][0]: " + array3d[0][0][0]); // Output = 1;
        System.out.println("Nilai dari array3d[1][0][2]: " + array3d[1][0][2]); // Output = 9;
    }
}
