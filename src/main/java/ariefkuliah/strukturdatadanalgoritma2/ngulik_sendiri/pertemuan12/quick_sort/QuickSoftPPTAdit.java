package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.quick_sort;

public class QuickSoftPPTAdit {
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int indeksAcuan = start - 1;
        for (int perulangan = start; perulangan < end; perulangan++) {
            if (array[perulangan] < pivot) {
                indeksAcuan++;
                int temporary = array[indeksAcuan];
                array[indeksAcuan] = array[perulangan];
                array[perulangan] = temporary;
            }
        }
        int temporary = array[indeksAcuan + 1];
        array[indeksAcuan + 1] = array[end];
        array[end] = temporary;
        return indeksAcuan + 1;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);

        }
    }

    static void printArray(int[] arr) {
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
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.print("Sebelum diurutkan: ");
        printArray(array);
        System.out.println();

        quickSort(array, 0, array.length - 1);

        System.out.print("Setelah diurutkan: ");
        printArray(array);
        System.out.println();
    }
}
