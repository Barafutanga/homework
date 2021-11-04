package ProgramLogic.entities;

import java.util.Scanner;

public class step9 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO AGE-OMETER 9000, PLEASE, INFORM YOUR AGE");

        System.out.print("AGE: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("UNDER 18");
        } else if (age > 60) {
            System.out.println("ABOVE 60");
        } else {
            System.out.println("ADULT");
        }


        sc.close();
    }
    
}
