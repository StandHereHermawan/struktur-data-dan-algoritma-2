package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice5.util.console;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice5.util.data_structure.ImplTumpukanPPTBased;

public class Show {

    public static void show(ImplTumpukanPPTBased operasi){
        while (!operasi.isEmpty()) {
            System.out.println("Nilai Top: " + (operasi.getTop()) +
                    " Dan Nilai selanjutnya adalah: " + operasi.peekStack() +
                    ". Isi Array sebelum operasi pop(): " + operasi.getArray_size_stack() +
                    ". Isi Array setelah operasi pop(): " + operasi.getArray_size_stack() +
                    ", Nilai hilang pasca operasi pop(): " + operasi.popStack()
            );
        }
    }
}
