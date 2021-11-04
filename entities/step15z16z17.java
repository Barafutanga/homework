package ProgramLogic.entities;
import java.util.Scanner;

public class step15z16z17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int prod = x * i;
            System.out.printf("%d * %d = %d", x, i, prod);
            System.out.println();
    }
    sc.close();
    }
}
