import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,total=0, temp= 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        num = input.nextInt();

        for (int i= 1 ; i <= num; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println("3ve 4 e tam bölünen sayılar:"+i);
                total+= i;
                temp++;
            }
        }
        System.out.println("3ve 4 e tam bölünen sayıların ortalaması:"+ total);
        System.out.println("3ve 4 e tam bölünen sayıların ortalaması:"+ total/temp);


    }
}