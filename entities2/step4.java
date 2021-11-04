package ProgramLogic.entities2;

public class step4 {
    public static void main(String[] args) {
        int[] vect = new int[15];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = i;
            if (i % 3 == 0) {
                vect[i] = i * 8;
                System.out.println(vect[i]);
            } else {                
                System.out.println(vect[i]);
            }                        
        }
    }
    
}
