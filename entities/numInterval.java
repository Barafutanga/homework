package homework.homework.entities;
import java.util.Scanner;

public class numInterval {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

    System.out.println("HELLO, YOU ARE IN SUPER-NUMBERINTERVAL! HERE HOW IT WORKS:\nTHE COMPUTER WILL GENERATE 2 RANDOM NUMBERS, AND YOU\nGENERATE A 3TH NUMBER");
    System.out.print("X: ");
    int x = sc.nextInt();
    int a = (int) Math.floor(Math.random() * 99);
    int b = (int) Math.floor(Math.random() * 99);
    do {
        a = (int) Math.floor(Math.random() * 99);
    } while (a > b);
    
    System.out.printf("A: %d | B: %d | C: %d", a, x, b);

    System.out.println();
    
    if (x < 0 || x < 100) {
        System.out.println("X IS INTO THE INTERVAL A-B");
    } else {
        System.out.println("X IS OUT OF THE INTERVAL A-B");
}


    sc.close();
    }
    

}
