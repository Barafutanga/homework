package ProgramLogic.entities2;

import java.util.Scanner;

public class step1b {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[8][4];

        System.out.println("HELLO, WELCOME TO MY 8x4 MATHEMATICAL MATRIZ, PLEASE, INSERT SOME ROUND NUMBERS TO FULLFILL IT!");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
