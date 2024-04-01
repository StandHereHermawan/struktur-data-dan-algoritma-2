package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice4;

import java.util.EmptyStackException;

public class TumpukanDariPPT {
    int[] tumpukan;
    int array_size_stack;
    int top;

    public void inisialisasi(int array_size) {
        array_size_stack = array_size;
        tumpukan = new int[array_size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == array_size_stack - 1);
    }

    public int popStack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tumpukan[top--];
    }

    public void pushStack(int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
            tumpukan = resizing(tumpukan);
        }
        tumpukan[++top] = data;
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
}
