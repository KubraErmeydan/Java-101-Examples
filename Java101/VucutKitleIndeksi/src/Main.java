import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo;
        double vücutKitleİndeksi;


        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen kilonuzu kg cinsenden giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        vücutKitleİndeksi = kilo / (boy * boy);

        System.out.println("Boyunuz: " + boy + "," + " Kilonuz:   " + kilo + "  Vücut kitle indeksiniz: " + vücutKitleİndeksi);
    }
}