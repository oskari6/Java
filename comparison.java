import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Cats or dogs?");
        String animal = scanner.nextLine();
        /*comparison operators
         * ==
         * !=
         * <
         * >
         * <=
         * >=
         */

         /* logical operators dont mix these together
          * && highest presedence
          * ||
          * !
          */
        if(age > 12 || animal.equals("dogs")) //comparison
        {
            System.out.println("Welcome");
        }
    }
}