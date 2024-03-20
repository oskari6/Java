import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] grades = new int[size]; //or int grades[] c style
        //int [] grades = {10, 9, ...}; give values like this
        
        for(int i = 0; i < size; i++) {
            int x = input.nextInt();
            grades[i] = x;
        }
        //System.out.println(Arrays.toString(grades));
        for(int k = 0; k < grades.length; k++) {
            if(grades[k] == 72) {
                System.out.println("FOUND");
            } //basically this is how it would work, the scanner is just not working.
        }
        //grades[0] = 15;
        //System.out.println(grades[0]);
        //System.out.println(Arrays.toString(grades)); // check out the array
        //System.out.println(Arrays.deepToString(grades)); //check array in arrays
    }
}


