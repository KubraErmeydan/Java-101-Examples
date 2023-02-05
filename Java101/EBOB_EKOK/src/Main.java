import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int num1= input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2= input.nextInt();
        int ebob=1;
        int i=2;
        while(num1%i==0 && num2%i==0)
        {
            if(num1<num2)
            {
                ebob=num1;
            }else
            {ebob=num2;

            }

            i++;
            break;
        }
        System.out.println("ekok :" +(num1*num2)+" ebob : " +ebob);

    }
}