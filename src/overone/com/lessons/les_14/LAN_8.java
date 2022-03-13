package overone.com.lessons.les_14;

import java.util.Scanner;

public class LAN_8 {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose array to work wiht ");
        int number;
        int String;

        System.out.println("you want to initialize from the console or random numbers ");
        System.out.println("enter lingth");
        int n = scanner.nextInt();
        int maximum = 0;
        int minimum = 0;
        int[] arrays = new int[n];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > maximum)
                maximum = arrays[i];

            if (arrays[i] < minimum)
                minimum = arrays[i];
        }
        System.out.println("Максимальное число: " + maximum);
        System.out.println("Минимальное число: " + minimum);
        System.out.println("Минимальное число: " + minimum);

        int array1[] = getArray(n);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "  ");
        }
        System.out.println();
        System.out.println("мак" + getMax(array1));
        System.out.println("мин" + getMin(array1));
    }


    public static int[] getArray(int x) {
        int a[] = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = 100 + (int) ((Math.random()) * 100);
        }
        return a;
    }

    public static int getMax(int arrays[]) {
        int max = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        return max;

    }

    public static int getMin(int arrays[]) {
        int min = 200;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
            }
        }
        return min;
    }}






