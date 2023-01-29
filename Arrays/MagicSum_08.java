package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();//прочетохме масив от данни
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArr.length; i++)//обхождаме еементите на масива
        {
            int sum;
            for (int j = i+1; j < numbersArr.length ; j++) {//проерка за всяка двойка числа дали дава сумата на magicSum

                sum=numbersArr[i]+numbersArr[j];
                if(sum==magicSum) {
                System.out.printf("%d %d\n",numbersArr[i],numbersArr[j]);}
                    }
                }

              }

            }




