package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String allSymbols = "";
        for (int i = 0; i < n ; i++) {
            String symbol = scanner.nextLine();
            allSymbols = allSymbols + symbol;}
        for (int i = 0; i < n; i++) {
            int asciiValue = allSymbols.charAt(i);
            sum = sum + asciiValue ;
        }
          System.out.printf("The sum equals: %d",sum);
    }
}
