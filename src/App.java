import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your username");
        String username = scanner.nextLine();
        System.out.println("What is your password");
        String password = scanner.nextLine();
        credentialsSetup user = new credentialsSetup(username, password);
        System.out.println("Here is your username and password");
        System.out.println(user.getUsername() + " and " + user.getPassword());

    }
}
