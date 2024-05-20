package ariefkuliah.strukturdatadanalgoritma2.pertemuan12.bubble_sort.practice1;

public class BubbleSort {

    /**
     * Fungsi untuk mengurutkan array menggunakan bubble sort.
     */
    static void bubbleSort(int[] arr) {
        int panjangArray = arr.length;
        boolean sudahDipindahkan;

        /**
         * Looping melalui seluruh element array.
         * */
        for (int perulangan = 0; perulangan < panjangArray - 1; perulangan++) {
            sudahDipindahkan = false;

            /**
             * Looping untuk membandingkan elemen yang bersebelahan.
             * */
            for (int indexElement = 0; indexElement < panjangArray - perulangan - 1; indexElement++) {

                /**
                 * Jika elemen yang ditemukan lebih besar dari elemen berikutnya.
                 * */
                if (arr[indexElement] > arr[indexElement + 1]) {

                    /**
                     * Tukar posisi elemen.
                     * */
                    int temp = arr[indexElement];
                    arr[indexElement] = arr[indexElement + 1];
                    arr[indexElement + 1] = temp;
                    sudahDipindahkan = true;
                }
            }

            /**
             * Jika tidak ada elemen yang ditukar selama iterasi, array sudah terurut.
             * */
            if (!sudahDipindahkan)
                break;
        }
    }

    /**
     * Fungsi untuk mencetak isi array.
     * */
    static void printArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (i < n && i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }

            if (i == arr.length - 1 && i < n) {
                System.out.println(arr[i] + ".");
            }
        }
        System.out.println();
    }

    /**
     * Fungsi utama program.
     * */
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Array sesudah diurutkan:");
        printArray(arr);
    }
}
