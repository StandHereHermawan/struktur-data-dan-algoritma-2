package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.b_kedua;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.b_kedua.service.Program;
import ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.b_kedua.view.Console;

import java.util.Scanner;

public class Task {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Console.showHeader();
        int[] values = Program.dataAwal();
        int[] result = Program.selectedProgram(SCANNER);

        Console.showArray(values, "Awal");
        Console.showArray(result, "Ganjil");
    }
}
