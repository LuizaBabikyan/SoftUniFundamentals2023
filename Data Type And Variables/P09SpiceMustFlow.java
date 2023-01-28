package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mineYield = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;
        int workersConsumption = 26;
        int currentMineYield;

        while(mineYield>=100){
            count++;
            currentMineYield=mineYield;
            mineYield=mineYield-workersConsumption;
            sum=sum+mineYield;
            mineYield=currentMineYield-10;
        }
        if (sum>26)
        {sum = sum - 26;}
        System.out.println(count);

        System.out.println(sum);
    }

}
