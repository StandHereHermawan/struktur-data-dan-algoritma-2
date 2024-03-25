package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.array_multidimension.practice4;

public class Practice {
    public static void main(String[] args) {

        int[][] array2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int nilaiPadaIndeksYangDicari = 9;

        int indeksBaris = -1;
        int indeksKolom = -1;

        outerloop:
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (array2d[i][j] == nilaiPadaIndeksYangDicari) {
                    indeksBaris = j;
                    indeksKolom = i;
                    break outerloop;
                }
            }
        }

        /**
        outerloop:
        break outerloop;

         memiliki fungsi untuk membungkus looping.
        */

        if (indeksKolom != -1) {
            System.out.println("Nilai " + nilaiPadaIndeksYangDicari + " yang ditemukan pada indeks: (" +
                    indeksKolom + ", " + indeksBaris + ").");
        } else {
            System.out.println("Nilai " + nilaiPadaIndeksYangDicari + " tidak ditemukan pada array.");
        }
    }
}
