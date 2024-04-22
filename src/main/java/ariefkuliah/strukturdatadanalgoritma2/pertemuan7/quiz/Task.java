package ariefkuliah.strukturdatadanalgoritma2.pertemuan7.quiz;

public class Task {
    private static final int[] array = new int[100];

    private static final int[] arrayGenap = new int[50];

    private static int value = 1;

    private static int[][][][] arrayMultiDimensi;

    public static void main(String[] args) {
        int[] ints = setArrayValue(array);
        showArraysValue(ints);
        int[] genapValue = setArrayGenapValue(ints, arrayGenap);
        showArraysValue(genapValue);

        arrayMultiDimensi = new int[][][][]{
                {
                    {{1, 70}, {2, 85}}, {{3, 90}, {4, 75}}
                }, {
                    {{5, 55}, {6, 60}}, {{7, 75}, {8, 80}}
                }
        };

        tampilkanArray4Dimensi(arrayMultiDimensi);
    }

    public static void tampilkanArray4Dimensi(int[][][][] arrayMultiDimensi){
        System.out.println("Nilai Array Multidimensi adalah:");
        for (int l = 0; l < arrayMultiDimensi.length; l++) {
            for (int k = 0; k < arrayMultiDimensi[0].length; k++) {
                for (int j = 0; j < arrayMultiDimensi[0][0].length; j++) {
                    for (int i = 0; i < arrayMultiDimensi[0][0][0].length; i++) {
                        System.out.print(arrayMultiDimensi[l][k][j][i] + " dengan index: " + l + ", " + k + ", " + j + ", " + i + ". ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[] setArrayGenapValue(int[] array, int[] arrayGenap) {
        int indexArrayGenap = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayGenap[indexArrayGenap] = array[i];
                indexArrayGenap++;
            }
        }
        return arrayGenap;
    }

    public static int[] setArrayValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value++;
        }
        return array;
    }

    public static void showArraysValue(int[] array) {
        System.out.println("Nilai Array adalah: ");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            } else {
                System.out.println(array[i] + ".");
            }
        }
        System.out.println("=======================================");
    }
}
