package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.tugas.buat_diserahin_ke_dosen.services;

public class Compare {

    private final int[][] hasilBanding = new int[3][4];

    public int[][] banding(int[][] arrayPertama, int[][] arrayKedua) {

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
        return hasilBanding;
    }
}
