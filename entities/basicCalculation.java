package homework.homework.entities;
import java.util.Scanner;

public class basicCalculation {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("WELCOME TO SIMPLE CALCULATOR! PLEASE, SELECT WITCH NUMBERS WE WANNA CALCULATE");

    System.out.print("Number 1: ");
    int n1 = sc.nextInt();
    System.out.print("Number 2: ");
    int n2 = sc.nextInt();
    int n3 = n1 + n2;

    System.out.print(n1 + " + " + n2 + " = " + n3);


    //ODD OR EVEN NUM
    if (n3 % 2 != 0) {
        System.out.println(" [ODD NUMBER]");
    } else {
        System.out.println(" [EVEN NUMBER]");
    }

    sc.close();
    }
}