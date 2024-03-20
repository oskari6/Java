import java.util.Scanner;

public class if_statement {

    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guess the password:");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        if(password.toLowerCase().equals(guess.toLowerCase())) //method chaining
        {
            System.out.println("Your guess was correct!");
            //return; //add this and will "else" will always run below
        } else if ("dont stop believing".toLowerCase().equals(guess.toLowerCase()))
        {
            System.out.println("You got the second password");
        } else
        {
            System.out.println("This is false");
        }
    }    //System.out.println("This is NOT always going to run!"); //replaced with else statement
}
