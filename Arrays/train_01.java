package Arrays.Exercise;

import java.util.Scanner;

public class train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int[] peopleInWagon = new int[n];//създаваме нов масив с дължина n , който все още е празен!
        for (int i = 0; i < n; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            peopleInWagon[i]=number;//пълним масива със стойности
            sum+=number;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(peopleInWagon[i]+" ");

        }
        System.out.println();
        System.out.println(sum);

    }
}
