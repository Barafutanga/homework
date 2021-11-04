package ProgramLogic.entities2;
import java.util.Scanner;

public class step1a {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        int n = 1;
        String[] vect = new String[n];
        int count = 0;
        
        System.out.printf("WELCOME TO 55 VECT, PLEASE, INSERT 55 CHARACTERS IN THIS VECTOR!\nIF YOU WRITE LESS THAN 55 CHARACTERS, THEN, THE PROGRAM WILL FAIL");
        System.out.println();

        //vector
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextLine();
        }

        //counter-crasher
        for (int i = 0; i < 55; i++) {    
            if (vect[0].charAt(i) != ' ')    
                count++;    
        }

        //output
        System.out.println(count);
        System.out.println(vect[0]);
        sc.close();
    }
    
}
