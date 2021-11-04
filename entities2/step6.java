package ProgramLogic.entities2;

public class step6 {
    public static void main(String[] args) {
            
        int[] vect = new int[20];

        //data insert
        System.out.println("VECTOR VALUES");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) Math.floor(Math.random() * 99);
            System.out.printf("%d ", vect[i]);
        }

        //comparator
            //[G] = Greater than
            //[=] = Equals
            //[L] = Less than
        System.out.println("COMPARATOR");
        for (int j = 1; j < vect.length; j++) {
            if (vect[j] > vect[0]) {
                System.out.print(vect[j] + "[G] ");
            } else if (vect[j] == vect[0]) {
                System.out.print(vect[j] + "[=] ");
            } else if (vect[j] < vect[0]) {
                System.out.print(vect[j] + "[L] ");
            }
        }

    }
}
