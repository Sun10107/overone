package overone.com.lessons.les_14;

import java.util.Arrays;
import java.util.Scanner;

public class LAN_6 {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number or words ");
        int size = scanner.nextInt();
        int[] arrays = new int[size];
        int number= scanner.nextInt();
        String string1 = scanner.toString();
        System.out.println("enter number arrays ");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }
        int maximum = 0;
        int minimum = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > maximum)
                maximum = arrays[i];

            if (arrays[i] < minimum)
                minimum = arrays[i];
        }
        System.out.println("Максимальное число: " + maximum);
        System.out.println("Минимальное число: " + minimum);
                {
            Arrays.sort(arrays);
            System.out.println(Arrays.toString(arrays));
        }
        System.out.println("we are looking for a number in an array"+number+". Index number"+number);

    }
}

