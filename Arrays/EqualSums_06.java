package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).
                            mapToInt(Integer::parseInt).toArray();//прочетохме масив от данни

        if(numbersArr.length <1) {
            System.out.println("0"); }
        //проверка дали масива ни се състои само от един елемент
        for (int index = 0; index <numbersArr.length; index++) {//обхождам елементите от масива


                int sumLeft = 0;
            int sumRight = 0;
            for (int left = 0; left <index ; left++) {//сумираме елементите на масива в ляво
                sumLeft += numbersArr[left]; }

                for (int right = index+1; right < numbersArr.length; right++) {//сумираме елементите на масива в дясно
                    sumRight+=numbersArr[right];

                }
         if(sumLeft==sumRight){//проверка дали сумите в ляво и дясно са еднакви
           System.out.println(index);
         break; }
         else  { if(index== numbersArr.length-1) //проверка дали при достигнат последния елемент от масива(обходен е целия масив)
                                                // няма равенство между двете суми
         { System.out.println("no");}
         }


                }

            }



        }



