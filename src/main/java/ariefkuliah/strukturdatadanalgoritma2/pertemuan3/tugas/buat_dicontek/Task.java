package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.tugas.buat_dicontek;

public class Task {
    public static void main(String[] args) {
        int[][] arrayPertama = {{9, 8, 12, 0}, {34, 1, 0, 24}, {43, 23, 14, 56}};
        int[][] arrayKedua = {{7, 6, 9, 19}, {12, 8, 4, 21}, {21, 18, 15, 56}};
        int[][] hasilBanding = new int[3][4];

        for (int i = 0; i < hasilBanding.length; i++) {
            for (int j = 0; j < hasilBanding[0].length; j++) {
                if (arrayPertama[i][j] < arrayKedua[i][j]) {
                    hasilBanding[i][j] = arrayKedua[i][j];
                } else if (arrayPertama[i][j] > arrayKedua[i][j]) {
                    hasilBanding[i][j] = arrayPertama[i][j];
                } else if (arrayPertama[i][j] == arrayKedua[i][j]) {
                    hasilBanding[i][j] = arrayPertama[i][j];
                }
            }
        }

        tampilkanArray(arrayPertama);
        tampilkanArray(arrayKedua);
        tampilkanArray(hasilBanding);
    }

    public static void tampilkanArray(int[][] array2dimension) {
        System.out.println("Nilai Matriks adalah :");
        for (int kolom = 0; kolom < array2dimension.length; kolom++) {
            for (int baris = 0; baris < array2dimension[0].length; baris++) {
                System.out.print(array2dimension[kolom][baris] + "  ");
            }
            System.out.print("\n");
        }
    }
}
