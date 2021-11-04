package ProgramLogic.entities;
import java.util.Scanner;
import java.util.Arrays;

public class step18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //vetor
        int n =  sc.nextInt(); 
        double[] vect = new double[n];
        
        //injeção de dados
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }
        
        //Ascending order
        int [] ar = new int [] {vect.length};
        Arrays.sort(ar);
        //Reverse
        reverse(ar);


        sc.close();
    }
    
        //Reverse class by geeksforgeeks
public static void reverse(int[] array)
{
  
    // Length of the array
    int n = array.length;
  
    // Swaping the first half elements with last half
    // elements
    for (int i = 0; i < n / 2; i++) {
  
        // Storing the first half elements temporarily
        int temp = array[i];
  
        // Assigning the first half to the last half
        array[i] = array[n - i - 1];
  
        // Assigning the last half to the first half
        array[n - i - 1] = temp;

            
        }
    }
}
