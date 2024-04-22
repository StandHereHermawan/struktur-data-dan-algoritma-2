package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan5.practice5.util.data_structure;

import java.util.EmptyStackException;

public class ImplTumpukanPPTBased {
    private int[] tumpukan;
    private int array_size_stack;
    private int top;

    public int getArray_size_stack() {
        return array_size_stack;
    }

    public int getTop() {
        return top;
    }

    public void inisialisasi(int array_size) {
        array_size_stack = array_size;
        tumpukan = new int[array_size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (array_size_stack - 1));
    }

    public int popStack() {
        int value = tumpukan[top];
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        array_size_stack--;
        top--;
        return value;
    }

    public void pushStack(int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
            this.tumpukan = resizing(tumpukan);
        }
        top++;
        tumpukan[top] = data;
    }

    public int[] resizing(int[] element) {
        int[] newSize = new int[2 * element.length];
        array_size_stack = newSize.length;
        System.arraycopy(element, 0, newSize, 0, array_size_stack);
        return newSize;
    }

    public int peekStack() {
        return tumpukan[top];
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int[] tumpukan;
        private int array_size_stack;

        public Builder ukuranArray(int array_size) {
            this.array_size_stack = array_size;
            this.tumpukan = new int[array_size];
            return this;
        }

        public ImplTumpukanPPTBased build() {
            int top = -1;
            return new ImplTumpukanPPTBased(this.tumpukan, this.array_size_stack, top);
        }
    }

    public ImplTumpukanPPTBased() {
    }

    public ImplTumpukanPPTBased(int[] tumpukan, int array_size_stack, int top) {
        this.tumpukan = tumpukan;
        this.array_size_stack = array_size_stack;
        this.top = top;
    }
}
