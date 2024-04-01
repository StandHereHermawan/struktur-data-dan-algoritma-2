package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice5;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice5.util.console.Show;
import ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice5.util.data_structure.ImplTumpukanPPTBased;

public class Task1 {
    public static void main(String[] args) {
        ImplTumpukanPPTBased operasi = ImplTumpukanPPTBased
                .builder()
                .ukuranArray(12)
                .build();

        operasi.pushStack(5);
        operasi.pushStack(19);
        operasi.pushStack(20);
        operasi.pushStack(29);
        operasi.pushStack(80);
        operasi.pushStack(91);
        operasi.pushStack(50);
        operasi.pushStack(40);
        operasi.pushStack(34);
        operasi.pushStack(64);
        operasi.pushStack(79);
        operasi.pushStack(67);

        Show.show(operasi);
    }
}
