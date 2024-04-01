import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch(name) {
            case "Michael": //combining cases
            case "Caleb":
                System.out.println("Welcome my man");
                break;
            case "Claire":
                System.out.println("Go away");
                break;
            default:
                System.out.println("Try again later");
                break;
        }
    }
}