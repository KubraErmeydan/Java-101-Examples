import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float armut, elma, domates, muz, patlican;
        double armutFiyat, elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? ");
        armut=input.nextFloat();
        armutFiyat= armut*2.14;

        System.out.print("Elma kaç kilo? ");
        elma=input.nextFloat();
        elmaFiyat= elma*3.67;

        System.out.print("Domates kaç kilo? ");
        domates=input.nextFloat();
        domatesFiyat= domates*1.11;

        System.out.print("Muz kaç kilo? ");
        muz=input.nextFloat();
        muzFiyat= muz*0.95;

        System.out.print("Patlıcan kaç kilo? ");
        patlican=input.nextFloat();
        patlicanFiyat= patlican*5.00;

        double total =patlicanFiyat+muzFiyat+domatesFiyat+elmaFiyat+armutFiyat;
        System.out.print("Toplam tutar: "+total);

    }
}