package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan12.quick_sort;

public class QuickSortCopilot {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
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
        int[] arrayNumbers = {10, 7, 8, 9, 1, 5};

        QuickSortCopilot sort = new QuickSortCopilot();
        System.out.print("\n" + "Array sebelum diurutkan: ");
        sort.printArray(arrayNumbers);
        System.out.println();
        // Function call
        sort.sort(arrayNumbers, 0, arrayNumbers.length - 1);
        System.out.print("\n" + "Array yang sudah disortir adalah: ");
        sort.printArray(arrayNumbers);
        System.out.println();
    }
}
