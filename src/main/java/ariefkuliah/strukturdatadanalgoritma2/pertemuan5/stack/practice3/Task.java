package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice3;

public class Task {
    public static void main(String[] args) {
        int nomorTampil = 0;
        Tumpukan tumpukan = new Tumpukan();

        /**
         * Masukkan 9 nama.
         * */
        tumpukan.push("Aditya Maulana");
        tumpukan.push("Ahmad Hambali");
        tumpukan.push("Dhiya Waffa Putriana Bilqist");
        tumpukan.push("Erlang Anggara Widjaksono");
        tumpukan.push("Gita Ayu Lestari");
        tumpukan.push("Jhon Endra Pandapotan Sipayung");
        tumpukan.push("M Noupal Abdullah");
        tumpukan.push("Niswah Kaifa Nazahah");
        tumpukan.push("Revaliza Dinara Shafira");

        /**
         * Kosongkan isi tumpukan dan tampilkan.
         * */
        System.out.println("\n" + "Isi Tumpukan adalah: ");
        while (!tumpukan.empty()) {
            nomorTampil++;
            String popped = tumpukan.pop();
            System.out.println(nomorTampil + ". " + popped);
        }

        System.out.println("Mencoba pop() pada tumpukan kosong:");
        System.out.println(tumpukan.pop());
    }
}

    class Tumpukan {
        final int MAXCAPACITY = 8;
        private String[] tumpukan = new String[MAXCAPACITY];
        private int puncakTumpukan;

        /**
         * Konstruktor.
         */
        public Tumpukan() {
            puncakTumpukan = -1;
        }

        /**
         * Memasukkan data ke tumpukan.
         * Nilai Balik Berupa false kalau tumpukan sudah penuh.
         */
        public boolean push(String data) {

            /**
             * Periksa apakah tumpukan sudah penuh atau belum.
             * */
            if (puncakTumpukan == (MAXCAPACITY - 1)) {
                System.out.println("Tumpukan Penuh!");
                System.out.println(data + " Tidak dimasukkan kedalam Tumpukan.");
                return false;
            }

            /**
             * Masukkan data kedalam tumpukan.
             * */
            puncakTumpukan++;
            tumpukan[puncakTumpukan] = data;
            return true;
        }

        public String pop() {
            if (!empty()) {
                return tumpukan[puncakTumpukan--];
            } else {
                return "**Error**";
                /**
                 * Menyatakan tumpukan sudah penuh.
                 * */
            }
        }

        public boolean empty() {
            return (puncakTumpukan == -1);
        }
    }

