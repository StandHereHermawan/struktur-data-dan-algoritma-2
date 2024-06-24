package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.quick_sort;

public class QuickSortCopilotEditGw {
    int partition(int[] isiArray, int indexTerendah, int panjangArray) {

        /**
         * Indeks tertinggi dalam suatu array.
         * sebagai penunjuk pada data terakhir
         * dalam suatu array.
         * */
        int indexTertinggi = panjangArray - 1;

        /**
         * Data yang berada pada posisi terakhir
         * yang menjadi pivot atau tumpuan.
         * */
        int dataTumpuan = isiArray[indexTertinggi];

        /**
         * Indeks untuk mengambil spesifik data dalam pengurutan.
         * */
        int indeksAmbilData = (indexTerendah - 1);

        System.out.print("isi array sebelum perulangan adalah: ");
        printArray(isiArray);
        System.out.println();
        System.out.println("Data Pivot atau Tumpuan: " + dataTumpuan);

        for (int perulangan = indexTerendah; perulangan < indexTertinggi; perulangan++) {
            if (isiArray[perulangan] <= dataTumpuan) {
                indeksAmbilData++;
                int dataSementara = isiArray[indeksAmbilData];
                isiArray[indeksAmbilData] = isiArray[perulangan];
                isiArray[perulangan] = dataSementara;
            }
        }

        System.out.print("isi array sesudah perulangan adalah: ");
        printArray(isiArray);
        System.out.println();
        System.out.println("Data Pivot atau Tumpuan: " + dataTumpuan);

        /**
         * Variabel Menyimpan Data Untuk Keperluan Pengurutan
         * */
        int dataSementara = isiArray[indeksAmbilData + 1];

        System.out.println("Data indeks ambil data sebelum disamakan: " + isiArray[indeksAmbilData + 1]);
        System.out.println("Data Sementara tersimpan: " + dataSementara);
        System.out.println("Indeks Ambil Data: " + indeksAmbilData);
        System.out.print("isi array sebelum disamakan adalah: ");
        printArray(isiArray);
        System.out.println();

        isiArray[indeksAmbilData + 1] = isiArray[indexTertinggi];
        isiArray[indexTertinggi] = dataSementara;

        System.out.println("Data indeks ambil data setelah disamakan: " + isiArray[indeksAmbilData + 1]);
        System.out.println("Data Sementara tersimpan: " + dataSementara);
        System.out.println("Indeks Ambil Data: " + indeksAmbilData);
        System.out.print("isi array setelah disamakan adalah: ");
        printArray(isiArray);
        System.out.println("\n");

        return indeksAmbilData + 1;
    }

    void sort(int[] isiArray, int indexTerendah, int indexTertinggi) {
        if (indexTerendah < indexTertinggi) {

            /**
             * Index data yang menjadi pivot atau tumpuan dalam algoritma sorting.
             * */
            int indeksPivot = partition(isiArray, indexTerendah, indexTertinggi);

            /**
             * Indeks data yang elemen-nya lebih kecil daripada index data
             * yang menjadi pivot atau tumpuan setelah proses pemindahan.
             * */
            int indexPivotSatu = indeksPivot - 1;

            /**
             * Indeks data yang elemen-nya lebih besar daripada index data
             * yang menjadi pivot atau tumpuan setelah proses pemindahan.
             * */
            int indexPivotDua = indeksPivot + 1;

            /**
             * Pengurutan Array yang elemen-nya lebih kecil
             * daripada index data yang menjadi pivot atau tumpuan
             * */
            sort(isiArray, indexTerendah, indexPivotSatu);

            /**
             * Pengurutan Array yang elemen-nya lebih besar
             * daripada index data yang menjadi pivot atau tumpuan
             * */
            sort(isiArray, indexPivotDua, indexTertinggi);
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

    void perbandingan(int[] arrayNumbers) {
        QuickSortCopilotEditGw program = new QuickSortCopilotEditGw();
        System.out.print("\n" + "Array yang belum disortir adalah: ");
        program.printArray(arrayNumbers);
        System.out.println("\n");
        // Function call
        program.sort(arrayNumbers, 0, arrayNumbers.length);
        System.out.print("Array yang sudah disortir adalah: ");
        program.printArray(arrayNumbers);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {10, 7, 8, 9, 1, 5};

        QuickSortCopilotEditGw operasi = new QuickSortCopilotEditGw();
        operasi.perbandingan(arrayNumbers);
    }
}