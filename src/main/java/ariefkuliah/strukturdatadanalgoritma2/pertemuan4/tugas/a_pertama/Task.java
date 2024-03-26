package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.a_pertama;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.a_pertama.service.Program;
import ariefkuliah.strukturdatadanalgoritma2.pertemuan4.tugas.a_pertama.view.Console;

import java.util.Scanner;

public class Task {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double[] arrayDouble = new double[]{};
        Console.showHeader();
        int inputNumber = Program.inputSection(SCANNER);
        double[] doubles = Program.firstMainProgramSection(inputNumber, arrayDouble, SCANNER);
        Console.showResult(doubles);
    }
}
