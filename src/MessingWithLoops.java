import java.util.Scanner;

public class MessingWithLoops {
    public static void main(String[] args) {
        // FOR loop
//        for (int i = 0; i < 10; i+=3 ) { //i++
//            System.out.println(i);
//        }

        // WHILE Loop
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        Scanner reader = new Scanner(System.in);
//        String answer = "no";
//        while (!answer.equals("yes")){
//            System.out.println("Mum, can I have an ice-cream?");
//            answer = reader.nextLine().trim().toLowerCase();
//        }

        //DO WHILE Loop
        Scanner reader = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Mum, can I have an ice-cream?");
            answer = reader.nextLine().trim().toLowerCase();
        } while (!answer.equals("yes"));
    }
}
