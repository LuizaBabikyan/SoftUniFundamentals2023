package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Add first to the second, divide (integer) the sum by the third number,
        // and multiply the result by the fourth number
        byte number1 = Byte.parseByte(scanner.nextLine());
        byte number2 = Byte.parseByte(scanner.nextLine());
        byte number3 = Byte.parseByte(scanner.nextLine());
        byte number4 = Byte.parseByte(scanner.nextLine());
        int result = ((number1+number2)/number3)*number4;
        System.out.println(result);
    }
}
