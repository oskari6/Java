import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//import java.util.LinkedList;

public class lists3 {
    public static void main(String[] args) {
        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
        allGrades.add(Arrays.asList(5, 3, 2, 6, 3));
        allGrades.add(Arrays.asList(4, 4, 4, 2, 4));
        allGrades.add(Arrays.asList(59, 40, 23, 6, 83));
//iterate through 2d list
        for(List<Integer> grades : allGrades) {
            for(int grade : grades) {
                System.out.println(grade + " ");
            }
            System.out.println();
        }
    }
}

/*  convert list to array
int[] grades = new int[allGrades.size()];
    for(int i= 0; i < allGrades.size(); i++) {
    }
     System.out.println(Arrays.toString(grades));

sort al list
Collections.sort(allGrades);
Collections.reverse(allGrades); // reverse
 System.out.println(grade);
*/



