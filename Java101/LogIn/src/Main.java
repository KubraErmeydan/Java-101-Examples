import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("User name: ");
        userName= input.nextLine();

        System.out.print("Passworrd: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Login successful");
        }else {
            System.out.println("Your information is wrong!");
        }
    }
}