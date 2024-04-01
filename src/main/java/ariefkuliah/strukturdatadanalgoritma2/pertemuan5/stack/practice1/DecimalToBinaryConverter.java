package ariefkuliah.strukturdatadanalgoritma2.pertemuan5.stack.practice1;

import java.util.Stack;

public class DecimalToBinaryConverter {

    public static void main(String[] args) {
        int decimalNumber = 25;
        int decimalNumber1 = 63;
        int decimalNumber2 = 127;
        int decimalNumber3 = 255;
        int decimalNumber4 = 511;
        int decimalNumber5 = 1023;
        int decimalNumber6 = 2047;
        int decimalNumber7 = 4095;
        int decimalNumber8 = 8191;

        System.out.println("Decimal-0: " + decimalNumber);
        System.out.println("Decimal-1: " + decimalNumber1);
        System.out.println("Decimal-2: " + decimalNumber2);
        System.out.println("Decimal-3: " + decimalNumber3);
        System.out.println("Decimal-4: " + decimalNumber4);
        System.out.println("Decimal-5: " + decimalNumber5);
        System.out.println("Decimal-6: " + decimalNumber6);
        System.out.println("Decimal-7: " + decimalNumber7);
        System.out.println("Decimal-8: " + decimalNumber8);

        System.out.println("Nilai Binary dari Decimal-0: "+ decimalToBinary(decimalNumber));
        System.out.println("Nilai Binary dari Decimal-1: "+ decimalToBinary(decimalNumber1));
        System.out.println("Nilai Binary dari Decimal-2: "+ decimalToBinary(decimalNumber2));
        System.out.println("Nilai Binary dari Decimal-3: "+ decimalToBinary(decimalNumber3));
        System.out.println("Nilai Binary dari Decimal-4: "+ decimalToBinary(decimalNumber4));
        System.out.println("Nilai Binary dari Decimal-5: "+ decimalToBinary(decimalNumber5));
        System.out.println("Nilai Binary dari Decimal-6: "+ decimalToBinary(decimalNumber6));
        System.out.println("Nilai Binary dari Decimal-7: "+ decimalToBinary(decimalNumber7));
        System.out.println("Nilai Binary dari Decimal-8: "+ decimalToBinary(decimalNumber8));
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}