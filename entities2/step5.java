package ProgramLogic.entities2;

public class step5 {
    public static void main(String[] args) {

        int[] vect = new int[30];
        int total = 0;
        double avg = 0.0;

        //data insert
        for (int i = 0; i < vect.length; i++) {
            vect[i] = i;
            System.out.printf("%d ", vect[i]);
        }
        System.out.println();

        //average vector size
        System.out.print("Average: ");
        for (int j = 0; j < vect.length + 1; j++) {
            if (j < vect.length) {
            total = total + vect[j];
            } else {
                avg = total / vect.length; 
                System.out.println(avg);
            }
        }
        //greater than vect avg printer
        System.out.println("Vector values higher than vect avg: ");
        for (int k = 0; k < vect.length; k++) {
                if (vect[k] > avg) {
                    System.out.printf("%d ", vect[k]);
                }
        } 
    }
    
}
