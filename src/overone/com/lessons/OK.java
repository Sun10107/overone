package overone.com.lessons;
import java.util.Scanner;

public class OK {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter number:");
        int j = number1.nextInt();
        Scanner operator = new Scanner(System.in);
        char operator1= operator.next().charAt(0);
        int s= number1.nextInt();
        int result=0;
        switch ( operator1) {
            case '+':
                result = j + s;
                break;
            case '-':
                result = j - s;
                break;
            case '*':
                result = j * s;
                break;
            case '/':
                result = j / s;
                break;
            default:
        }
        System.out.println(" Result"+ result);
        }
}
