package ProgramLogic.entities;
import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO GEOMETRON 8000, PLEASE INSERT MEASURES FOR THE RECTANGLE");

        System.out.println("Width");
        double width = sc.nextInt();
        System.out.println("Height");
        double height = sc.nextInt();

        double area = width * height;
        double perimeter = (width * 2) + (height * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);




        sc.close();
    }
    
}
