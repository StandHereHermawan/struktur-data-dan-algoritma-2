package ariefkuliah.strukturdatadanalgoritma2.pertemuan2.practice1;

public class Practice {
    public static void main(String[] args) {
        int[] values = {8, 12, 20, 15, 7, 5, 6, 4, 32, 3};
        /**
         * Deklarasi Variable Jumlah nilai angka pada variable values
         * */
        int summary = 0;

        /**
         * Menghitung Jumlah nilai angka pada variable values
         * */
        for (int i = 0; i < values.length; i++) {
            summary = values[i] + summary;
        }

        float average = (float) summary / 10;

        /**
         * Mencetak seluruh nilai angka pada variable elemen array dengan nama
         * */
        for (int i = 0; i < values.length; i++) {
            System.out.print("Deret Bilangan : ");
            System.out.print(values[i] + ", ");
            if (i % 2 == 0) {
                System.out.print("\n");
            } else if (i == values.length - 1) {
                System.out.print("\n");
            }
        }

        System.out.println("Jumlah literal value didalam array values adalah = " + summary);
        System.out.println("Rata-rata bilangan adalah " + average);
    }
}
