package ProgramLogic.entities;
import java.util.Scanner;
//import ProgramLogic.entities.extens.step10addon;

public class step10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        String coxinha = "coxinha";
        int price = sc.nextInt();
        int quantity = 100;
        double storagevalue = price * quantity;
        double averageprice = storagevalue / quantity;
        
        System.out.printf("Média de preços dos(as) %s é de R$:%.2f%n", coxinha, averageprice);
    
        sc.close();
    }
}
