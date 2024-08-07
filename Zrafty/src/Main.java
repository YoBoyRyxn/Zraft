import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        if (args.length == 0) {

            WelcomePage wel = new WelcomePage();
            System.out.println("Enter User Name: ");

            String userName = scan.nextLine();
            wel.GetWelcomeMessage(userName);

            CommandsArgs c = new CommandsArgs();
            c.generateNames();


        }
    }
}