package WhileLoop.More;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numDetergent=Double.parseDouble(scanner.nextLine());//750 мл 1 бутилка препарат
        String input= scanner.nextLine();
        int count=0;
        double sumDishes=0;
        double sumPots=0;
        double currentDetergent=0;
        double calculatedDetergent =0;
        double finalDishes=0;
        while (!input.equals("End")) {
           double dishes = Double.parseDouble(input);
           calculatedDetergent=750*numDetergent;
            count++;
            if (count %3 ==0) {
                sumPots+=dishes;
            }
            sumDishes+=dishes;//за чиния 5 мл на всяко трето завъртане на цикъла 15 мл
            finalDishes=sumDishes-sumPots;
            currentDetergent=finalDishes*5+sumPots*15;

            if ((calculatedDetergent-currentDetergent)<0) {
                System.out.printf("Not enough detergent, %.0f ml. more necessary!",Math.abs(calculatedDetergent-currentDetergent));
                break;
            }
            input= scanner.nextLine();
        }
        if ((calculatedDetergent-currentDetergent)>=0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%.0f dishes and %.0f pots were washed.%n",(finalDishes),(sumPots));
            System.out.printf("Leftover detergent %.0f ml.",Math.abs((currentDetergent-calculatedDetergent)));
        }
    }
}
