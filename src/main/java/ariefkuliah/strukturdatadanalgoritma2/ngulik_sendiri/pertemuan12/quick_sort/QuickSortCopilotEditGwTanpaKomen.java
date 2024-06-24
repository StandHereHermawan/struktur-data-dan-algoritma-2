package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.quick_sort;

public class QuickSortCopilotEditGwTanpaKomen {
    int partition(int[] isiArray, int indexTerendah, int panjangArray) {

        int indexTertinggi = panjangArray - 1;
        int tumpuan = isiArray[indexTertinggi];
        int indexAcuan = (indexTerendah - 1);

        for (int perulangan = indexTerendah; perulangan < indexTertinggi; perulangan++) {
            if (isiArray[perulangan] <= tumpuan) {
                indexAcuan++;
                int dataSementara = isiArray[indexAcuan];
                isiArray[indexAcuan] = isiArray[perulangan];
                isiArray[perulangan] = dataSementara;
            }
        }

        int dataSementara = isiArray[indexAcuan + 1];
        isiArray[indexAcuan + 1] = isiArray[indexTertinggi];
        isiArray[indexTertinggi] = dataSementara;
        return indexAcuan + 1;
    }

    void sort(int[] isiArray, int indexTerendah, int indexTertinggi) {
        if (indexTerendah < indexTertinggi) {
            int pivot = partition(isiArray, indexTerendah, indexTertinggi);
            int indexPivotSatu = pivot - 1;
            int indexPivotDua = pivot + 1;

            sort(isiArray, indexTerendah, indexPivotSatu);
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

    void perbandingan(int[] arrayNumbers){
        QuickSortCopilotEditGwTanpaKomen program = new QuickSortCopilotEditGwTanpaKomen();

        System.out.print("\n" + "Array yang belum disortir adalah: ");
        program.printArray(arrayNumbers);
        System.out.println();

        // Function call
        program.sort(arrayNumbers, 0, arrayNumbers.length);
        System.out.print("\n" + "Array yang sudah disortir adalah: ");
        program.printArray(arrayNumbers);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {10, 7, 8, 9, 1, 5};

        QuickSortCopilotEditGwTanpaKomen operasi = new QuickSortCopilotEditGwTanpaKomen();
        operasi.perbandingan(arrayNumbers);
    }
}