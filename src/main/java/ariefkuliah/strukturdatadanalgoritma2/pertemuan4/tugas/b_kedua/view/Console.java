package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.b_kedua.view;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.b_kedua.service.Program;

import java.util.Scanner;

public class Console {
    public static void showHeader() {
        System.out.println("Program Tugas 2");
        System.out.println("Mencari Bilangan Ganjil");
        System.out.println();
        System.out.println("Pilih menu yang ada dibawah.");
        System.out.println("1. Masukkan data otomatis {1.2, 3.4, 5.6, 7.8}");
        System.out.println("2. Masukkan data manual");
        System.out.println("=======================");
        System.out.println();
    }

    public static int[] selectedProgram(Scanner SCANNER) {
        System.out.print("Pilih Menu Program: ");
        int inputMenu = SCANNER.nextInt();
        int[] ints = new int[]{};
        switch (inputMenu) {
            case 1:
                ints = Program.autoInput();
                break;
            case 2:
                ints = Program.manualInput(SCANNER);
                break;
            default:
                System.out.println("Menu yang dipilih tidak ada.");
        }
        return ints;
    }

    public static void showArray(int[] values, String keterangan) {
        System.out.println("Nilai Array " + keterangan + ": ");
        for (int i = 0; i < values.length; i++) {
            if (i < values.length - 1) {
                System.out.print(values[i] + ", ");
            } else if (i == values.length - 1) {
                System.out.print(values[i] + ".");
                System.out.println();
            }
        }
    }
}
