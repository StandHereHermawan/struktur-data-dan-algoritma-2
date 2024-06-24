package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.insertion_sort;

public class InsertionSortGFGEditGw {
    void sort(int[] isiArray) {
        int PanjangArray = isiArray.length;
        for (int indeksPerulangan = 1; indeksPerulangan < PanjangArray; ++indeksPerulangan) {
            int dataTerpilih = isiArray[indeksPerulangan];
            int indeksSebelumPerulangan = indeksPerulangan - 1;

            System.out.println();
            System.out.print("Sebelum melewati perulangan isi array: ");
            printArray(isiArray);
            System.out.println();
            /* Memindahkan Elemen dari isi Array[0...i-1]
               yang lebih besar dari data terpilih
               ke posisi mereka sekarang. */
            while (indeksSebelumPerulangan >= 0 && isiArray[indeksSebelumPerulangan] > dataTerpilih) {
                isiArray[indeksSebelumPerulangan + 1] = isiArray[indeksSebelumPerulangan];
                indeksSebelumPerulangan = indeksSebelumPerulangan - 1;
            }
            isiArray[indeksSebelumPerulangan + 1] = dataTerpilih;

            System.out.print("Setelah melewati perulangan isi array: ");
            printArray(isiArray);
            System.out.println();
        }
    }

    void printArray(int[] arr) {
        int panjangArray = arr.length;
        for (int i = 0; i < panjangArray; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }
            if (i == arr.length - 1) {
                System.out.print(arr[i] + ".");
            }
        }
    }

    public static void main(String[] args) {
        InsertionSortGFGEditGw program = new InsertionSortGFGEditGw();
        int[] arr = { 12, 11, 13, 5, 6 };

        System.out.print("Array sebelum diurutkan: ");
        program.printArray(arr);
        System.out.println();

        program.sort(arr);

        System.out.println();
        System.out.print("Array setelah diurutkan: ");
        program.printArray(arr);
        System.out.println();
    }
}
