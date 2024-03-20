import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        /* icu
        *initialization
        *comparison or condition
        *update
        */
        /* 
        int i = 1;
        while( i< 11)
        {
           System.out.println("iteration " + i);
            i++;
        }*/
        System.out.println("Guess the password: ");
        String password = "let me in";
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        while(!guess.equals(password))
        {
            System.out.println("Guess the password: ");
            guess = scanner.nextLine();
        }

       System.out.println("congrats");
        scanner.close(); // should be done for memory usage
    }
}


