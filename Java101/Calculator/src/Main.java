import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = input.nextInt();

        System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Division");
        System.out.print("Please Enter your choice: ");
        select= input.nextInt();

        if (select==1){
            System.out.println("Addition: "+(num1+num2));
        } else if (select==2) {
            System.out.println("Extraction: "+(num1-num2));
        } else if (select==3) {
            System.out.println("Multiplication: "+(num1*num2));
        } else if (select==4) {
            if(num2!=0) {
                System.out.println("Division: " + (num1 / num2));
            }else{
                System.out.println("A number cannot be divided by zero!");
            }
        }else {
            System.out.println("Wrong choice! Try Again");
        }



    }
}