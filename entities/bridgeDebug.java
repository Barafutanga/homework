package ProgramLogic.entities;
import java.util.Scanner;
import Projects.Codworth.salaryStats;

import java.util.Locale;

public class bridgeDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int id = 2021221639;
        String coder = "Antônio Otaviano";
        
        System.out.printf(
        "CODWORTH, MADE BY PIMBA ENTERPRISE\nMain Programmer: %s [ID: %d]\nPDF Presentation: %s\nPDF Manual: %s\nVideo recording: %s\nVideo editor: %s",
        coder, id, coder, coder, coder, coder);
        System.out.println();
        System.out.println(
        "WELCOME TO CODWORTH SLAV, I MEAN, EMPLOYEE FINANCYS!\nFIRST OF ALL, WHAT OPERATION YOU WANT TO DO? (DIGIT ONE OF VALUES BELOW)");
        System.out.println("1- hire employee\n2- fire employee\n3- employees status");
        System.out.printf("OPERATION SELECTED: ");
        
        int task = sc.nextInt();
        
        if (task == 1) {
            
            System.out.println("HOW MANY EMPLOYEES ARE YOU HIRING?");
            int nHiring = sc.nextInt();
            
            for (int i = 0; i < nHiring; i++) {
                salaryStats WorkerStats = new salaryStats();
                
                System.out.print("Employee name: ");
                String[] vectname = new String[] {sc.nextLine()};
                    for (String out : vectname) {
                    WorkerStats.name = out;
                }
                System.out.println();

                System.out.print("Gross salary: ");
                WorkerStats.grossSalary = sc.nextDouble();
                
                System.out.print("Tax: ");
                WorkerStats.taxSalary = sc.nextDouble();
                
                System.out.println(WorkerStats);
            }
        } else if 
        (task == 2) {
            
        }
        
        sc.close();
    }
}
