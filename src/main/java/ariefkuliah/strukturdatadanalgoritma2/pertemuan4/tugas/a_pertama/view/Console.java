package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.a_pertama.view;

public class Console {
    public static void showHeader() {
        System.out.println("Program Tugas 1");
        System.out.println();
        System.out.println("Pilih menu yang ada dibawah.");
        System.out.println("1. Masukkan data otomatis {1.2, 3.4, 5.6, 7.8}");
        System.out.println("2. Masukkan data manual");
        System.out.println("=======================");
        System.out.println();
    }

    public static void showResult(double[] doubles){
        for (int i = 0; i < doubles.length; i++) {
            if (i == 0){
                System.out.println("Nilai Elemen Pertama: " + doubles[i]);
            }

            if (i == doubles.length - 1) {
                System.out.println("Nilai Elemen Terakhir: " + doubles[doubles.length - 1]);
            }
        }
    }
}
