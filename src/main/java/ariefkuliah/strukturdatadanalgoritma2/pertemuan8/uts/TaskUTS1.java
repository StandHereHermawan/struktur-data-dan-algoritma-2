package ariefkuliah.strukturdatadanalgoritma2.pertemuan8.uts;

public class TaskUTS1 {
    /**
     * Menampilkan Nilai beserta beserta index
     * */
    public static void main(String[] args) {
        int[][][] array3dimensi = {
                {{1, 1, 1}, {2, 2, 2}},
                {{3, 3, 3}, {4, 4, 4}},
                {{5, 5, 5}, {6, 6, 6}}
        };

        TaskUTS1.tampilkanNilaiSpesifikDiArray3d(1, 0, 0, 0, array3dimensi);
        TaskUTS1.tampilkanNilaiSpesifikDiArray3d(2, 0, 1, 0, array3dimensi);
        TaskUTS1.tampilkanNilaiSpesifikDiArray3d(3, 1, 0, 0, array3dimensi);
        TaskUTS1.tampilkanNilaiSpesifikDiArray3d(4, 1, 1, 2, array3dimensi);
        TaskUTS1.tampilkanNilaiSpesifikDiArray3d(5, 2, 0, 0, array3dimensi);
        TaskUTS1.tampilkanNilaiSpesifikDiArray3d(6, 2, 1, 2, array3dimensi);
    }

    public static void tampilkanNilaiSpesifikDiArray3d(int value, int file, int kolom, int baris, int[][][] array3d) {
        int count = 0;
        for (int fileLoop = 0; fileLoop < array3d.length; fileLoop++) {
            for (int kolomLoop = 0; kolomLoop < array3d[0].length; kolomLoop++) {
                for (int barisLoop = 0; barisLoop < array3d[0][0].length; barisLoop++) {
                    if (array3d[fileLoop][kolomLoop][barisLoop] == value && fileLoop == file && kolomLoop == kolom && barisLoop == baris) {
                        count++;
                        System.out.println("Nilai: " + array3d[fileLoop][kolomLoop][barisLoop] + ". " +
                                "dengan File : " + fileLoop + ". " +
                                "dengan Kolom: " + kolomLoop + ". " +
                                "dengan Baris: " + barisLoop + ". " +
                                "Total Dipanggil : " + count);
                    }
                }
            }
        }
    }
}