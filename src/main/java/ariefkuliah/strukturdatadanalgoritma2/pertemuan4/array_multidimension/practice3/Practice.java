package ariefkuliah.strukturdatadanalgoritma2.pertemuan4.array_multidimension.practice3;

public class Practice {
    public static int cariIndeks(int nilai, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nilai) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 4, 2};
        int nilaiPadaIndeks = 8;
        int indeksYangDimaksud = cariIndeks(nilaiPadaIndeks, array);
        if (indeksYangDimaksud != -1) {
            System.out.println("Nilai " + nilaiPadaIndeks + " ditemukan di indeks ke = " + indeksYangDimaksud + ".");
        } else {
            System.out.println("Nilai " + nilaiPadaIndeks + " tidak ditemukan di array.");
        }
    }
}
