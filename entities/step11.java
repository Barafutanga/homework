package ProgramLogic.entities;
import java.util.Scanner;

public class step11 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO DIVISOR, CHOOSE 1 VALUE FOR EACH NUMBER BELOW");
        
        System.out.print("X= ");
        int x = sc.nextInt();
        System.out.print("Y= ");
        int y = sc.nextInt();

        if (y != 0) {
            int prod = x / y;
            System.out.printf("%d / %d = %d", x, y, prod);
        } else {
            System.out.println("ERROR 404 - CAN'T DIVIDE BY ZERO");
        }
        
        
        

    sc.close();
    }
    
}
