package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.quick_sort;

public class QuickSortGFG {
    // A utility function to swap two elements
    void swap(int[] isiArray, int dataPertama, int dataKedua) {
        int dataSementara = isiArray[dataPertama];
        isiArray[dataPertama] = isiArray[dataKedua];
        isiArray[dataKedua] = dataSementara;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    int partition(int[] isiArray, int indexPertama, int indexTerakhir) {
        // Choosing the pivot
        int dataTumpuan = isiArray[indexTerakhir];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int indeksTumpuan = (indexPertama - 1);

        for (int perulangan = indexPertama; perulangan <= indexTerakhir - 1; perulangan++) {
            // If current element is smaller than the pivot
            if (isiArray[perulangan] < dataTumpuan) {

                // Increment index of smaller element
                indeksTumpuan++;
                swap(isiArray, indeksTumpuan, perulangan);
            }
        }
        swap(isiArray, indeksTumpuan + 1, indexTerakhir);
        return (indeksTumpuan + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    void quickSort(int[] isiArray, int indexPertama, int indexTerakhir) {
        if (indexPertama < indexTerakhir) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int indexTumpuan = partition(isiArray, indexPertama, indexTerakhir);
            System.out.println("\n" + "Index Tumpuan pada function quicksort: " + indexTumpuan + ", Dengan nilai: " + isiArray[indexTumpuan]);
            // Separately sort elements before
            // partition and after partition
            System.out.print("Array sebelum fungsi quicksort: ");
            printArray(isiArray);
            System.out.println();

            quickSort(isiArray, indexPertama, indexTumpuan - 1);
            quickSort(isiArray, indexTumpuan + 1, indexTerakhir);
            System.out.print("Array setelah fungsi quicksort: ");
            printArray(isiArray);
        }
    }

    // To print sorted array
    void printArray(int[] arr) {
        int panjangArray = arr.length;

        for (int i = 0; i < panjangArray; i++) {

            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + ".");
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("\n" + "Array sebelum diurutkan:");

        QuickSortGFG sort = new QuickSortGFG();
        sort.printArray(arr);
        System.out.println();
        // Function call
        sort.quickSort(arr, 0, arr.length - 1);
        System.out.print("\n" + " Array yang sudah disortir adalah: ");
        sort.printArray(arr);
    }
}
