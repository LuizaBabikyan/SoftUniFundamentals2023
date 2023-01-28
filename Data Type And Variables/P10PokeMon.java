package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int originOfN = N;
        int count = 0;
        while (N>=M) {
            N = N - M;
            count++;
            if (N==0.5*originOfN && Y!=0)
            { N=N/Y; }

        }
        System.out.println(N);
        System.out.println(count);
    }
}
