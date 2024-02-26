package ariefkuliah.strukturdatadanalgoritma2.pertemuan1;

import java.util.Scanner;

public class Praktek1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka Perkalian Faktorial : ");
        int inputNumber = scanner.nextInt();
        Praktek1 praktek1 = new Praktek1();
        praktek1.function(inputNumber);
    }

    public void function(int inputNumber) {
        int total = 0;
        for (int i = 1; i <= inputNumber; i++) {
            System.out.println("Urutan Angka Faktoroal : " + i);
            total = total + i;
            if (i == inputNumber) {
                System.out.println("Jumlah Angka Faktoroal : " + total);
            }
        }
     }
}
