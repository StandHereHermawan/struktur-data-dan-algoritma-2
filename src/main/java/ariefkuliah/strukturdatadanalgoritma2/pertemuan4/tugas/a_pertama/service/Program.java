package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.a_pertama.service;

import java.util.Scanner;

public class Program {
    public static int inputSection(Scanner SCANNER){
        System.out.print("Masukkan nomor menu \nuntuk program selanjutnya: ");
        int inputNumber = SCANNER.nextInt();
        return inputNumber;
    }

    public static double[] firstMainProgramSection(int inputNumber, double[] arrayDouble, Scanner SCANNER){
        if (inputNumber == 1) {
            arrayDouble = new double[]{1.2, 3.4, 5.6, 7.8};
        } else if (inputNumber == 2) {
            System.out.print("Masukkan Ukuran Array: ");
            int inputtedArrayValue = SCANNER.nextInt();
            System.out.println();
            arrayDouble = new double[inputtedArrayValue];
            for (int i = 0; i < arrayDouble.length; i++) {
                System.out.print("Masukkan Nilai Desimal untuk data ke-" + (i + 1) + " : ");
                arrayDouble[i] = SCANNER.nextDouble();

                if (i == arrayDouble.length - 1){
                    System.out.println();
                }
            }
        } else {
            System.out.println("Menu Yang dipilih Tidak ada.");
        }
        return arrayDouble;
    }
}
