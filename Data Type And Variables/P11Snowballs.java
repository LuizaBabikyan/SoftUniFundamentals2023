package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        double currentSnowballValue = Integer.MIN_VALUE;//тук винаги ще се пази най - голямата стойност
        double snowballValue;
        int snowballSnowPrint = 0;
        int snowballTimePrint = 0;
        int snowballQualityPrint = 0;
        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
        //(snowballSnow / snowballTime) ^ snowballQuality
            snowballValue = Math.pow((snowballSnow*1.0/snowballTime),snowballQuality);

            if (currentSnowballValue<snowballValue) {
                currentSnowballValue=snowballValue ;
                snowballSnowPrint = snowballSnow;
                snowballTimePrint = snowballTime;
                snowballQualityPrint = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowPrint,snowballTimePrint,currentSnowballValue,snowballQualityPrint);
    }
}
