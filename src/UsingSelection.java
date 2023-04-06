import java.util.Scanner;

public class UsingSelection {
    public static void main(String[] args) {
        String username = "admin";
        String password = "Password";

        Scanner reader = new Scanner(System.in);

        // User is not case sensitive
        System.out.print("Please enter your username: ");
        String enteredUsername = reader.nextLine().toLowerCase().trim();

        // Password is case sensitive
        System.out.print("Please enter your password: ");
        String enteredPassword = reader.nextLine();

//        if (username.equals(enteredUsername)){
//            System.out.println("Correct username!");

//            if (password.equals(enteredPassword)){
        if ((username.equals(enteredUsername)) && (password.equals(enteredPassword))){
                System.out.println("Correct username and password!");
            }
//            else {
//                System.out.println("Incorrect username or password!");
//            }
//        }
        else {
            System.out.println("Incorrect username or password!");
        }

    }
}
