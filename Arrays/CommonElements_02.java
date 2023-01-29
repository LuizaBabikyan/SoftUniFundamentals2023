package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");
       for (int i = 0; i < secondArr.length; i++) {
                  for (int j = 0; j < firstArr.length; j++) {
                      if (firstArr[j].equals(secondArr[i])) {
                          System.out.print(firstArr[j] + " ");
                          // for (String elementSecondArray:secondArr ) {//обхождаме елементите от масива с foreach,
                          // понеже не ни интересува позицията на елемента, а само
                          //неговото съдържание!!!

                          // for (String elementFirstArray:firstArr  ) {

                          //if (elementFirstArray.equals(elementSecondArray))
                          //{ System.out.print(elementFirstArray + " ");
                          // break;}
                      }
                  }
            
        }

                }

            }


            



