package ProgramLogic.entities2;
import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO VECT 2XMULTIPLIER, PLEASE, INSERT A SIZE FOR THE VECTOR, AND SEE THE MAGIC HAPPENS!");
        System.out.printf("Vector Size: ");
        int i = sc.nextInt();

        int[] vect = new int[i];

        for (int j = 0; j < vect.length; j++) {
            int k = j * 2;
            vect[j] = k;
            System.out.println(vect[j]);
        }

        sc.close();
    }
    
}
