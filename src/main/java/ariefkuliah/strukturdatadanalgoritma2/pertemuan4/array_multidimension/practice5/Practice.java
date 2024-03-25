package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.array_multidimension.practice5;

import java.util.Scanner;

public class Practice {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Array dari char yang diberikan.
         * */
        char[] array = {'i', 'n', 'd', 'o', 'n', 'e', 's', 'i', 'a'};

        System.out.print("Masukkan sebuah karakter: ");

        /**
         * Menerima input dari keyboard user.
         * */
        char inputCharacter = scanner.next().charAt(0);

        boolean found = false;
        for (char character : array) {
            if (character == inputCharacter) {
                found = true;
                break;
            }
        }

        /**
         * Menentukan apakah ada karakter dalam array.
         * */
        if (found) {
            System.out.println("Karakter " + inputCharacter + " ditemukan dalam array.");
        } else {
            System.out.println("Karakter " + inputCharacter + " tidak ditemukan dalam array");
        }

        System.out.print("Nilai pada array adalah: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println(".");
    }
}
