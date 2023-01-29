package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = Integer.parseInt(scanner.nextLine());//брой редове с числа
        String [] firstArray = new String[numRows];//създаваме нов масив, в който ще държим числа, подадени от конзолата
        String [] secondArray = new String[numRows];
        for (int row = 0; row < numRows ; row++) {
        String [] numbers=scanner.nextLine().split(" ");
        String firstNumber = numbers[0];
        String secondNumber = numbers[1];
        if (row % 2 == 0) {
            secondArray [row] = firstNumber;
            firstArray [row] = secondNumber;

        }
        else {
            firstArray [row] = firstNumber;
            secondArray [row] = secondNumber;
        }
        }

        System.out.println(String.join(", ",secondArray));
        System.out.println(String.join(" ",firstArray));

        }
    }

