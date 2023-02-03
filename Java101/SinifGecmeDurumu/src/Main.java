import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, physics, chemical, history,turkish;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math score: ");
        math= input.nextInt();

        System.out.print("Enter your physics score: ");
        physics = input.nextInt();

        System.out.print("Enter your chemical score: ");
        chemical= input.nextInt();

        System.out.print("Enter your history score: ");
        history= input.nextInt();

        System.out.print("Enter your turkish score: ");
        turkish= input.nextInt();

        if ((math >= 0 && math <= 100) &&(history >= 0 && history <= 100) && (turkish >= 0 && turkish <= 100) &&
                (physics >= 0 && physics <= 100) && (chemical >= 0 && chemical <= 100)) {

            int sum = (turkish + history + chemical + physics + math);
            double average = sum / 5.0;
            if (average <= 55) {
                System.out.println("Sorry you failed the class" + "\n" + "Your average score:" + average);
            } else {
                System.out.println("You passed the class successfully" + "\n" + "Your average score:" + average);
            }
        }else {
            System.out.println("Scores should be between 0-100");
        }
    }
}