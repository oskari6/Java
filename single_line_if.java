import java.util.Scanner;
public class single_line_if {
    public static void main(String[] args) {
        String name = "Claire";
        //boolean welcome = name.equals("Claire") ? true : false;

        boolean welcome = false;

        if(name.toLowerCase().equals("Claire")) welcome = true;
            System.out.println("Welcome, Claire!");
                
        System.out.println(welcome);
    }
}


