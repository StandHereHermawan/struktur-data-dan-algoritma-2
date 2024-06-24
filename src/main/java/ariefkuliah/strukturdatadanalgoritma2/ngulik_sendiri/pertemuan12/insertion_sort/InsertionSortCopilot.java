package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.insertion_sort;

public class InsertionSortCopilot {
    public static void insertionSort(int[] isiArray) {
        int panjangArray = isiArray.length;
        for (int indeksPerulangan = 1; indeksPerulangan < panjangArray; indeksPerulangan++) {
            int dataTerpilih = isiArray[indeksPerulangan];
            int indeksSebelumPerulangan = indeksPerulangan - 1;
            while ((indeksSebelumPerulangan > -1) && (isiArray[indeksSebelumPerulangan] > dataTerpilih)) {
                isiArray[indeksSebelumPerulangan + 1] = isiArray[indeksSebelumPerulangan];
                indeksSebelumPerulangan--;
            }
            isiArray[indeksSebelumPerulangan + 1] = dataTerpilih;
        }
    }
}