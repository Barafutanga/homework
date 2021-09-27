package homework.homework.entities;
import java.util.Scanner;
import java.util.Arrays;

public class step3z6 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner (System.in);

        System.out.println("WELCOME TO ARITHMETIC-8000, PLEASE, INSERT 4 VALUES WITCH WE WANNA USE");

        //Data insertion
        System.out.print("Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Number 3: ");
        int n3 = sc.nextInt();
        System.out.print("Number 4: ");
        int n4 = sc.nextInt();
        
        //Ascending order
        int [] ar = new int [] {n1, n2, n3, n4};
        Arrays.sort(ar);
        
        System.out.println("ASCENDING NUMBER ORDER");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();

        //Arithmetic media calculation
        double average = (n1 + n2 + n3 + n4) / 4;
        System.out.print("ARITHMETIC MEDIA IS:" + average);

        //Average verifier
        if (average <= 6) {
            System.out.println(" - [REPROVED]");
        } else {System.out.println(" - [APPROVED]");
        }     

        sc.close();
    }
}
