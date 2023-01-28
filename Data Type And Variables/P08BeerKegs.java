package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name;
        String currentName = "";
        double currentVolume = Integer.MIN_VALUE;
        double calcVolume;
        for (int i = 1; i <=n; i++) {
            String NameKeg = scanner.nextLine();
            Double radius = Double.parseDouble(scanner.nextLine());
            Double height = Double.parseDouble(scanner.nextLine());
      calcVolume = Math.PI*radius*radius*height;
      name = NameKeg;//name -> отговаря на името на изчисл. обем
    if (calcVolume>currentVolume)  {
        currentVolume=calcVolume;
        currentName=name;
    }

        }
        System.out.println(currentName);
    }
}
