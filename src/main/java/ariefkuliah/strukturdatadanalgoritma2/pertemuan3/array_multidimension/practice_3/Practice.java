package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.array_multidimension.practice_3;

public class Practice {
    public static void main(String[] args) {

        /**
         * Mendefinisikan matrix 3 x 3.
         * */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriks awal:");
        displayMatrix(matrix);

        /**
         * Melakukan transpose matrix menggunakan function atau method.
         * */
        int[][] transposed = transpose(matrix);

        System.out.println("\nMatriks setelah di transpose:");
        displayMatrix(transposed);
    }

    /**
     * Function/Method untuk men-transpose matrix.
     * */
    public static int[][] transpose(int[][] matrix) {

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int kolom = 0; kolom < matrix.length; kolom++) {
            for (int baris = 0; baris < matrix[0].length; baris++) {
                transposedMatrix[baris][kolom] = matrix[kolom][baris];
            }
        }

        return transposedMatrix;
    }

    /**
     * Function/Method menampilkan matriks.
     * */
    public static void displayMatrix(int[][] matrix) {
        for (int kolom = 0; kolom < matrix.length; kolom++) {
            for (int baris = 0; baris < matrix[0].length; baris++) {
                System.out.print(matrix[kolom][baris] + " ");
            }
            System.out.print("\n");
        }
    }
}
