package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P06TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char firstChar = (char)('a'+i);
                    char secondChar = (char) ('a'+j);
                    char thirdChar = (char) ('a'+k);
                    System.out.printf("%c%c%c\n",firstChar,secondChar,thirdChar);
                }

            }
        }
    }
}
