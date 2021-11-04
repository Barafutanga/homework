package ProgramLogic.entities;
import java.util.Scanner;

public class step8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO, LETS COMPARE 2 NUMBERS AND SEE THE HIGHER");
        
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();

        int higher = max(a, b);

        System.out.println("HIGHER NUMBER: " + higher);

        sc.close();
    }

        public static int max(int a, int b) {
            int aux;
            if (a > b) {
                aux = a;            
            } else {
                aux = b;
            }
            return aux;
        }
}
