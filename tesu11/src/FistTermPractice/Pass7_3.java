package FistTermPractice;

public class Pass7_3 {

    public static void main(String[] args) {
        int a[] = {102,98,122,-97};
        double b[] = {12.5,33.5,-12.7,18.4,13.33};
        String c[] = {"赤","青","黄","白","黒","紫"};

        printIntArray(a);
        printDoubleArray(b);
        printStringArray(c);
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}

