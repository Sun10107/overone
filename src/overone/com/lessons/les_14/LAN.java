package overone.com.lessons.les_14;

import java.util.Scanner;
import java.util.Arrays;
public class LAN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sourceString = initString(scan);
        char[] upperCaseVoweletters = {'A', 'O', 'I', 'Y'};
        char[] voweletters = new char[8];
        int vowe1 = 0;
        initVoweArray(voweletters, upperCaseVoweletters);
        vowe1 =  amountOfVowe1(sourceString, voweletters);
        System.out.println("Amount of vowels Letters are" + vowe1);
    }

    public static String initString(Scanner scan) {
        System.out.println("ENTER STRING");
        return scan.nextLine();
    }
    public static void initVoweArray(char[] arrayOfLetter,char[] upperCaseVowe1) {
        int j=0;
        char space=' ';
        for (int i=0;i<upperCaseVowe1.length;i++) {
            arrayOfLetter[j] = upperCaseVowe1[i];
            j++;
            arrayOfLetter[j] = (char) (upperCaseVowe1[i] + 32);
            j++;
             }
            }
    public static int amountOfVowe1(String sourceString, char[] arrayOfVowe1Letters) {
        int amountOfVowe1 = 0;
        System.out.println("VoweLetters:");
        for (int i = 0; i < sourceString.length(); i++) {
            if (isVowe1(sourceString.charAt(i), arrayOfVowe1Letters)) {
                amountOfVowe1++;
                System.out.println(sourceString.charAt(i) + " ");
            }
        }
        System.out.println();
        return amountOfVowe1;
    }

    public static boolean isVowe1(char symbol, char[] arrayOfLetters) {
        for (int i = 0; i < arrayOfLetters.length; i++)
            if (arrayOfLetters[i] == symbol) {
                return true;
            }
              return false;
       }

    }



