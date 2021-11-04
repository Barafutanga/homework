package ProgramLogic.entities2;

public class step3 {
    public static void main(String[] args) {

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] copia = new int[10];

        System.out.println("VET1:");
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] += i;
            System.out.println(vet1[i]);
        }

        System.out.println("VET2:");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] =+ (5 + i);
            System.out.println(vet2[i]);
        }
    
        System.out.println("COPIA:");
        int j = -1;
        for (int i = 0; i < copia.length; i++) {
            
            if (i < 5) {
                copia[i] = vet1[i];  
            } else {
                j++;
                copia[i] = vet2[j];
            }
            System.out.println(copia[i]);
        }

    }
    
}
