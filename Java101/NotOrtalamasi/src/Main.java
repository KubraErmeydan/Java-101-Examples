import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, physics, chemical, biology, history,turkish;
        String ctrl;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math score: ");
        math= input.nextInt();

        System.out.print("Enter your physics score: ");
        physics = input.nextInt();

        System.out.print("Enter your chemical score: ");
        chemical= input.nextInt();

        System.out.print("Enter your biology score: ");
        biology= input.nextInt();

        System.out.print("Enter your history score: ");
        history= input.nextInt();

        System.out.print("Enter your turkish score: ");
        turkish= input.nextInt();

        int sum = (turkish+history+biology+chemical+physics+math);
        double average = sum/6.0;
        System.out.println("Your average score:"+ average);

        ctrl= (average>= 60) ? "You passed the class successfully " : "Sorry you failed the class";
        System.out.println(ctrl);

    }
}