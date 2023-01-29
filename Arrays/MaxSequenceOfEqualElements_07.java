package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();//прочетохме масив от данни
        int lastCount=0;
        int printElement=0;
        for (int i = 0; i < numbersArr.length; i++) {//обхождаме числата от масива
            //int currentNumber = numbersArr[i];
            int count=1;
            for (int j = i+1; j < numbersArr.length ; j++) {

                if (numbersArr[i]==numbersArr[j]) {count++;

                    if (lastCount<count) {lastCount=count; printElement=numbersArr[i];}
                else if (lastCount==count) { }
                }
                else {break;}
            }
        }
        for (int i = 0; i < lastCount; i++) {
            System.out.printf ("%d ",printElement); //отпечатваме с цикъл, повтарящите елементи,
            // толкова пъти, колото е стойността на LastCount
        }


    }
}
