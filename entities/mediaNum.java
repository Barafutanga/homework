package homework.homework.entities;
import java.util.Scanner;

public class mediaNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("WELCOME TO ARITHMETIC-8000, PLEASE, INSERT 4 VALUES WITCH WE WANNA USE");

        System.out.print("Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Number 3: ");
        int n3 = sc.nextInt();
        System.out.print("Number 4: ");
        int n4 = sc.nextInt();

        double average = (n1 + n2 + n3 + n4) / 4;
        System.out.println("ARITHMETIC MEDIA IS:" + average);

        if (average <= 6) {
            System.out.println("REPROVED");
        } else {System.out.println("APPROVED");
    }
        sc.close();
    }
    
}
