package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice2;

import java.util.Stack;

public class ContohTumpukan2 {
    public static void main(String[] args) {

        /**
         * Buat Objek
         * */
        Stack<String> stack = new Stack<>();

        /**
         * Masukkan 9 nama
         * */
        stack.push("Aditya Maulana");
        stack.push("Ahmad Hambali");
        stack.push("Dhiya Waffa Putriana Bilqist");
        stack.push("Erlang Anggara Widjaksono");
        stack.push("Gita Ayu Lestari");
        stack.push("Jhon Endra Pandapotan Sipayung");
        stack.push("M Noupal Abdullah");
        stack.push("Niswah Kaifa Nazahah");
        stack.push("Revaliza Dinara Shafira");

        /**
         * Kosongkan isi tumpukan dan tampilkan
         * */
        System.out.println("Isi Tumpukan: ");
        int nomor = 0;
        while (!stack.isEmpty()) {
            nomor++;
            String nama = stack.pop();
            System.out.println(nomor + ". " + nama);
        }
    }
}
