package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07WaterTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            sum = sum + litersOfWater;
            if(sum > 255) {
                System.out.println("Insufficient capacity!");
                sum=sum-litersOfWater;
            }


        }
        System.out.println(sum);
    }
}
