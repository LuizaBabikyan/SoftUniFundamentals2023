package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());
        int result = numberOfPeople/capacityOfElevator;
        if (result*capacityOfElevator==numberOfPeople)
        {System.out.println(result);}
        else {result=result+1;
            System.out.println(result);}

    }
}
