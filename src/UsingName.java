import java.util.Scanner;

public class UsingName {
    public static void main(String[] args) {
        byte age;

        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = reader.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = reader.nextLine();

        System.out.print("Please enter your age: ");

        try {
            age = reader.nextByte();
        }
        catch (Exception e){
            System.out.println("You've entered an incorrect value");
            System.out.println("Your age has been defaulted to 16");
            age = 16;
        }


        System.out.printf("Your name is: %s %s, and you, " +
               "%s, are %d years old, nice to meet you!%n",firstName,lastName,firstName,age);
    }
}
