package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.b_kedua.service;

import java.util.Scanner;

public class Program {
    public static int[] autoInput() {
        int[] values = dataAwal();

        return sortGanjil(values);
    }

    public static int[] dataAwal(){
        int[] values = new int[50];
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
        return values;
    }

    public static int[] sortGanjil(int[] values) {
        int[] ganjil = new int[values.length / 2];
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 1) {
                ganjil[j] = values[i];
                j++;
            }
        }
        return ganjil;
    }

    public static int[] manualInput(Scanner SCANNER) {
        System.out.print("Masukkan ukuran Array: ");
        int[] values = new int[SCANNER.nextInt()];
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            System.out.print("Data ke: " + (i + 1) + ", Masukkan nilai: ");
            values[i] = SCANNER.nextInt();
            System.out.println();
        }
        return values;
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
}
