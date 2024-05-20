package ariefkuliah.strukturdatadanalgoritma2.pertemuan12.merge_sort.practice1;

public class MergeSort {

    /**
     * Fungsi menggabungkan 2 sub array dari arr[].
     * */
    static void merge(int[] arr, int left, int mid, int right) {

        /**
         * menentukan ukuran dari 2 subarray yang akan digabungkan.
         * */
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /**
         * Membuat array sementara.
         * */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /**
         * Menyalin data ke array sementara.
         * */
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        /**
         * Menggabungkan array sementara kembali ke arr[l...r].
         * */
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /**
         * Menyalin elemen-elemen yang tersisa dari L[] jika ada.
         * */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Fungsi MergeSort Utama yang mengimplementasikan algoritma mergesort.
     * */
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            /**
             * Mencari titik tengah dari array.
             * */
            int mid = (left + right) / 2;
            /**
             * Membagi dan mengurutkan bagian pertama dan kedua.
             * */
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            /**
             * Menggabungkan kedua bagian yang sudah diurutkan.
             * */
            merge(arr,left,mid,right);
        }
    }

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

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array sesudah diurutkan:");
        printArray(arr);
    }
}
