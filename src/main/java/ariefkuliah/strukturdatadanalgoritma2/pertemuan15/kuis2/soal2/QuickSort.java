package ariefkuliah.strukturdatadanalgoritma2.pertemuan15.kuis2.soal2;

public class QuickSort {
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
        String[] nama = {"DENI", "AHMAD", "DANI", "RIZAL", "ARIEL", "BUDI", "RINA", "WIWIN", "SARI", "ADIT"};
        int[] nilai = {75, 80, 65, 70, 77, 90, 50, 85, 72, 60};

        for (int i = 0; i < panjangArray; i++) {
            if (i != arr.length - 1) {
                if (arr[i] == 1010) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[0] + ", " + "Nilai: " + nilai[0]);
                } else if (arr[i] == 1002) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[1] + ", " + "Nilai: " + nilai[1]);
                } else if (arr[i] == 1013) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[2] + ", " + "Nilai: " + nilai[2]);
                } else if (arr[i] == 1015) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[3] + ", " + "Nilai: " + nilai[3]);
                } else if (arr[i] == 1007) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[4] + ", " + "Nilai: " + nilai[4]);
                } else if (arr[i] == 1001) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[5] + ", " + "Nilai: " + nilai[5]);
                } else if (arr[i] == 1011) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[6] + ", " + "Nilai: " + nilai[6]);
                } else if (arr[i] == 1008) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[7] + ", " + "Nilai: " + nilai[7]);
                } else if (arr[i] == 1009) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[8] + ", " + "Nilai: " + nilai[8]);
                } else if (arr[i] == 1020) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[9] + ", " + "Nilai: " + nilai[9]);
                }
            }

            if (i == arr.length - 1) {
                if (arr[i] == 1010) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[0] + ", " + "Nilai: " + nilai[0]);
                } else if (arr[i] == 1002) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[1] + ", " + "Nilai: " + nilai[1]);
                } else if (arr[i] == 1013) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[2] + ", " + "Nilai: " + nilai[2]);
                } else if (arr[i] == 1015) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[3] + ", " + "Nilai: " + nilai[3]);
                } else if (arr[i] == 1007) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[4] + ", " + "Nilai: " + nilai[4]);
                } else if (arr[i] == 1001) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[5] + ", " + "Nilai: " + nilai[5]);
                } else if (arr[i] == 1011) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[6] + ", " + "Nilai: " + nilai[6]);
                } else if (arr[i] == 1008) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[7] + ", " + "Nilai: " + nilai[7]);
                } else if (arr[i] == 1009) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[8] + ", " + "Nilai: " + nilai[8]);
                } else if (arr[i] == 1020) {
                    System.out.print("\n" + "NIM: " + arr[i] + ", " + "Nama: " + nama[9] + ", " + "Nilai: " + nilai[9]);
                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Soal Nomor 2.");

        int[] array = {1010, 1002, 1013, 1015, 1007, 1001, 1011, 1008, 1009, 1020};
        System.out.print("\n" + "Sebelum diurutkan:");
        QuickSort quickSort = new QuickSort();
        quickSort.printArray(array);
        System.out.println();

        quickSort.sort(array, 0, array.length - 1);

        System.out.print("\n" + "Setelah diurutkan: ");
        quickSort.printArray(array);
        System.out.println();
    }
}
