package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int lastDigit ;
        int sum = 0;
        while (n>0) {
            lastDigit = n % 10;

            sum = sum+lastDigit;

           n = n/10;
        }
        System.out.println(sum);
    }
}
