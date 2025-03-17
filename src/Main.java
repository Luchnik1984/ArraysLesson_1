import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        int[] integerNumber = new int[]{1, 2, 3};
        float[] floatNumber = {1.57f, 7.654f, 9.986f};
        byte[] byteNumber = new byte[10];
        for (byte i = 0; i < byteNumber.length; i++) {
            // выводим индексы ячеек массива по порядку.
            byteNumber[i] = i;
        }
        System.out.println(Arrays.toString(integerNumber) +
                "\n" + Arrays.toString(floatNumber) + "\n" +
                Arrays.toString(byteNumber));

        // Задача 2.
        System.out.println("\nЗадача 2.");
        for (int i = 0; i < integerNumber.length; i++) {
            if (i == integerNumber.length - 1) {
                System.out.println(integerNumber[i]);
                break;
            }
            System.out.print(integerNumber[i] + ",");
        }
        for (int i = 0; i < floatNumber.length; i++) {
            if (i == floatNumber.length - 1) {
                System.out.println(floatNumber[i]);
                break;
            }
            System.out.print(floatNumber[i] + ",");
        }
        for (int i = 0; i < byteNumber.length; i++) {
            if (i == byteNumber.length - 1) {
                System.out.println(byteNumber[i]);
                break;
            }
            System.out.print(byteNumber[i] + ",");
        }
        // Задача 3.
        System.out.println("\nЗадача 3.");
        for (int i = integerNumber.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integerNumber[i]);
                break;
            }
            System.out.print(integerNumber[i] + ",");
        }
        for (int i = floatNumber.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(floatNumber[i]);
                break;
            }
            System.out.print(floatNumber[i] + ",");
        }
        for (int i = byteNumber.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(byteNumber[i]);
                break;
            }
            System.out.print(byteNumber[i] + ",");
        }

        // Задача 4.
        System.out.println("\nЗадача 4.");
        for (int i = 0; i < integerNumber.length; i++) {
            if (integerNumber[i] % 2 != 0) {
                integerNumber[i] = integerNumber[i] + 1;
            }
        }
        System.out.println(Arrays.toString(integerNumber));
    }
}