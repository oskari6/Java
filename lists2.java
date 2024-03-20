import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//import java.util.LinkedList;

public class lists2 {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(5, 3, 2, 6, 3);

        for(int i =0; i < grades.size(); i++) {
            grades.set(i, grades.get(i) * 2);
            System.out.println(grades.get(i));
        }
        //for each loop
        for(int grade : grades) {
            System.out.println(grade);
        }
    }
}


