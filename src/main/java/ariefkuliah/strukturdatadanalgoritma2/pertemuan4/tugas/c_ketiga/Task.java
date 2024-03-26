package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.c_ketiga;

public class Task {
    private static final int[][] array2d = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10},
            {3, 6, 9, 12, 15}
    };

    public static int[] nilaiIndex(int values, int[][] data) {
        int[] indexValue;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == values) {
                    return indexValue = new int[]{i, j};
                }
            }
        }
        return indexValue = new int[]{-1, -1};
    }

    public static void main(String[] args) {
        show(array2d);
        int[] nilaiIndex1 = nilaiIndex(2, array2d);
        showIndex(nilaiIndex1, 2);
        int[] nilaiIndex2 = nilaiIndex(6, array2d);
        showIndex(nilaiIndex2, 6);
        int[] nilaiIndex3 = nilaiIndex(12, array2d);
        showIndex(nilaiIndex3, 12);
    }

    public static void showIndex(int[] values, int value) {
        System.out.println("Nilai " + value + " ada di indeks: " );
        for (int i = 0; i < values.length; i++) {
            if (values[i] != -1) {
                System.out.print("indeks ke-" + (i + 1) + " = " + values[i]);
                if (i < values.length - 1) {
                    System.out.print(", ");
                }
                if (i == values.length - 1) {
                    System.out.print(".");
                    System.out.println();
                }
            } else {
                System.out.println("Nilai index tidak ada.");
            }
        }
    }

    public static void show(int[][] values) {
        System.out.println("Data Array 2D: ");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
        System.out.println();
    }
}
