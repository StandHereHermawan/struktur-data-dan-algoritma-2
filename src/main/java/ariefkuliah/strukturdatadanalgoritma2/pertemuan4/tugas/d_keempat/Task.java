package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.d_keempat;

import java.util.Scanner;

public class Task {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            System.out.print("Masukkan karakter yang akan ditampilkan: ");
            chars[i] = SCANNER.next().charAt(0);
        }
        System.out.println();

        System.out.print("Karakter yang di-inputkan adalah: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
