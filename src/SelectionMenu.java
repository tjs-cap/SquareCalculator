import java.util.Scanner;

public class SelectionMenu {
    public static void main(String[] args) {
        System.out.println(" ### Main Menu ###");
        System.out.println(" 1. Enter new account");
        System.out.println(" 2. Update account");
        System.out.println(" 3. Delete account");
        System.out.println(" x. Exit menu");
        System.out.println();

        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your option (1,2,3,x): ");
        String entry = reader.nextLine().toLowerCase().trim();
/*
        if(entry.equals("1")){
            System.out.println("Going to new account");
        } else if (entry.equals("2")) {
            System.out.println("Going to update account");
        } else if (entry.equals("3")) {
            System.out.println("Going to delete account");
        } else if (entry.equals("x")) {
            System.out.println("Going to exit menu");
        } else {
            System.out.println("Incorrect entry!");
        }
*/
        switch(entry){
            case "1":
                System.out.println("Going to new account");
                break;
            case "2":
                System.out.println("Going to update account");
                break;
            case "3":
                System.out.println("Going to delete account");
                break;
            case "x":
                System.out.println("Going to exit menu");
                break;
            default:
                System.out.println("Incorrect entry!");
        }

        int num = 1;
        if (num == 1){
            System.out.println("Number one");
        } else {
            System.out.println("Not number one");
        }

        // Ternary Operator
        System.out.println((num == 1) ? "Number one" : "Not number one");
    }
}
