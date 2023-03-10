import java.util.Scanner;

public class Main {

    static int power(int a, int b){
        int result = 1;
        for (int i=1; i <=b; i++){
            result *=a;
        }
        System.out.println("Sonuc: "+ result);
        return result;
    }
    public static void main(String[] args) {

        System.out.print("Taban değeri giriniz: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b= scan.nextInt();
        power(a,b);
    }
}