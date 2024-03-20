package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.tugas.buat_diserahin_ke_dosen;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan3.tugas.buat_diserahin_ke_dosen.services.Compare;
import ariefkuliah.strukturdatadanalgoritma2.pertemuan3.tugas.buat_diserahin_ke_dosen.view.Show;

public class MainTask {
    public static void main(String[] args) {
        int[][] firstArray = {
                {9, 8, 12, 0},
                {34, 1, 0, 24},
                {43, 23, 14, 56}
        };

        int[][] secondArray = {
                {7, 6, 9, 19},
                {12, 8, 4, 21},
                {21, 18, 15, 56}
        };

        int[][] hasilBanding = new Compare().banding(firstArray, secondArray);

        Show.result("Array Pertama", firstArray);
        Show.result("Array Kedua", secondArray);
        Show.result("Hasil Array dari Operasi \nBanding", hasilBanding);
    }
}
