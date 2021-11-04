package ProgramLogic.entities2;

public class step11 {
    public static void main(String[] args) {
        
        int[] vect = new int[12];
        int x = (int) Math.floor(Math.random() * 22);
        int y = (int) Math.floor(Math.random() * 22);
        int pos1 = (int) Math.floor(Math.random() * 11);
        int pos2 = (int) Math.floor(Math.random() * 11);
        int xVal = 0;
        int yVal = 0;

        System.out.println("VECTOR");
        for (int i = 0; i < vect.length; i++) {
            if (i == pos1) {
                vect[i] = x;
            } else if (i == pos2) {
                vect[i] = y;
            } else {
            vect[i] = i;
            }
            System.out.print(vect[i] + " ");
        }
        System.out.println();

        System.out.println("X AND Y MULTIPLICATION");
        for (int j = 0; j < vect.length; j++) {
            if (vect[j] == x) {
                xVal = vect[j];
            } else if(vect[j] ==y) {
                yVal = vect[j];
            }
        }
        int product =  xVal * yVal;
        System.out.println(product);
    }
    
}
