package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Четем масив с целочислени стойности от клавиатурата
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int lastElement = numbersArr[numbersArr.length-1];

        // 2.Правим цикъл, за да обходим всеки елемнт от масива
        for (int index = 0; index < numbersArr.length-1; index++) {  // 3.Проеряваме дали съответния елемент
                                                                 // от вече стартиралия цикъл
            int count = 0;                                      // е по - голям от неговия дясно стоящ елемент
            for (int pos = index + 1; pos < numbersArr.length; pos++) {

                if (numbersArr[index] <=  numbersArr[pos]) {//иска =
                    count++;
                }
                 // 4. отпечатваме елементите , които отговарят на поставеното условие

            }
            if (count == 0) {
                                  System.out.printf("%d ", numbersArr[index]);
                               }
        }

        System.out.print(lastElement);
    }
}
