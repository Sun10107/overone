package overone.com.lessons.les_14;

import java.util.Arrays;
import java.util.Scanner;

public class LAN_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str1 = initString(scan).split("\\w");
        System.out.println(Arrays.toString(str1));
        int counterWord = str1.length;
        System.out.println(counterWord);
    }
    static String initString(Scanner scan){
        return scan.nextLine();
    }
}


