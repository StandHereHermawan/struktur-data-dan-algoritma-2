package ariefkuliah.strukturdatadanalgoritma2.pertemuan3.tugas.buat_diserahin_ke_dosen.view;

public class Show {
    public static void result(String keterangan, int[][] array2dimension) {
        System.out.print("\n");
        System.out.print(keterangan + " ");
        System.out.println("Nilai Matriks adalah :");
        for (int kolom = 0; kolom < array2dimension.length; kolom++) {
            for (int baris = 0; baris < array2dimension[0].length; baris++) {
                System.out.print(array2dimension[kolom][baris] + "  ");
            }
            System.out.print("\n");
        }
    }
}
