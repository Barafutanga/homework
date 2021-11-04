package ProgramLogic.entities2;

public class step8 {
    public static void main(String[] args) {
        
        int[] vect = new int[20];

        System.out.println("ORIGINAL ORDER ");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = i;
            System.out.printf("%d ", vect[i]);
        }
        System.out.println();

        System.out.println("INVERTED ORDER ");
        for (int j = 0; j < vect.length; j++) {
            vect[j] = vect[19] - j;
            System.out.printf("%d ", vect[j]);
        }

    }
    
}
