package homework.homework.entities;
import java.util.Scanner;
import java.util.Arrays;

public class debug {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int [] ar = new int[] {a, b, c}; 

    Arrays.sort(ar);

    for (int i = 0; i < ar.length; i++) {
        System.out.println(ar[i]);
    }
        
    

   
    sc.close();
    }
    

}
