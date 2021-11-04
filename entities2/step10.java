package ProgramLogic.entities2;
import java.util.Scanner;

public class step10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int num = sc.nextInt();
        int verif = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) Math.floor(Math.random() * 6);

            if (v[i] == num) {
                System.out.printf("FOUND %d IN POSITION [%d]", v[i], i);
                verif++;
            }
        }
        if (verif == 0) {
            System.out.println("INSERTED NUMBER DOES NOT EXIST IN THIS VECTOR!");
        }
        sc.close();
    }    
}
