package ProgramLogic.entities2;

public class step7 {
    public static void main(String[] args) {
        
        int[] vect1 = new int[10];
        int[] vect2 = new int[10];
        int[] tVect = new int[10];

        //data insert
        System.out.print("VECTOR 1 ");
        for (int i = 0; i < vect1.length; i++) {
            vect1[i] = (int) Math.floor(Math.random() * 20);
            System.out.print(vect1[i] + " ");
        }
        System.out.println();

        System.out.print("VECTOR 2 ");
        for (int j = 0; j < vect1.length; j++) {
            vect2[j] = (int) Math.floor(Math.random() * 20);
            System.out.print(vect2[j] + " ");
        }
        System.out.println();

        System.out.print("VECTOR 3 ");
        for (int k = 0; k < vect2.length; k++) {
            tVect[k] = vect1[k] * vect2[k];
            System.out.print(tVect[k] + " ");
        }
    }
    
}
