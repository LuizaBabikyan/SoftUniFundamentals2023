package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();//прочетохме масив от данни
        String [] commandArr = scanner.nextLine().split(" ");
        String [] commandArr1 = new String[commandArr.length];
        for (int i = 0; i < commandArr.length; i++) {
            commandArr1[i]=commandArr[i];

        }
        String commandFirstElement = commandArr[0];
               while (!commandFirstElement.equals("end")) {
                   if( commandFirstElement.equals("swap")){ //размени стойности в масива
                       int index1= Integer.parseInt(commandArr1[1]);//четем от новия масив
                       int index2= Integer.parseInt(commandArr1[2]);
                       int firstElemSwap ;
                       firstElemSwap = numbersArr[index1];
                       numbersArr[index1] = numbersArr[index2];
                       numbersArr[index2] = firstElemSwap;

                   }

                       else if(commandFirstElement.equals("multiply")) {
                       int index1= Integer.parseInt(commandArr1[1]);
                       int index2= Integer.parseInt(commandArr1[2]);
                       int resultFirstIndex = numbersArr[index1]*numbersArr[index2];
                       numbersArr[index1] = resultFirstIndex;

                   }
                       else if(commandFirstElement.equals("decrease")) {
                       for (int i = 0; i < numbersArr.length; i++) {
                           numbersArr[i] = numbersArr[i]-1;
                       }

                   }

                   commandArr1 = scanner.nextLine().split(" ");//създаваме втори масив
                   commandFirstElement = commandArr1[0];
             }
        String[] printArray = new String[numbersArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
           printArray[i] =  String.valueOf(numbersArr[i]);
        }

        System.out.println(String.join(", ",printArray));
    }
}
