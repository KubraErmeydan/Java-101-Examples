import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input= new Scanner(System.in);
        int right = 3,select, balance= 1500;
        while (right>0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password= input.nextLine();

            if (userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba hoşgeldiniz.");
                System.out.println("1- Para Yatırma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cıkıs yap");

                System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                select= input.nextInt();

                switch (select){
                    case 1:
                        System.out.print("Yatırmak istediğiniz para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz para miktarı: ");
                         price = input.nextInt();
                        if (price> balance){
                            System.out.print("Bakiye yetersiz. ");
                        }else {
                            balance-=price;
                        }
                        break;
                    case 3:
                        System.out.print("Bakiyeniz: "+ balance);
                        break;
                    case 4:
                        System.out.print("İyi günler..");
                        break;
                    default:
                        System.out.print("Hatalı tuşlama yaptınız.");
                }
        }else{
                right--;
                System.out.println("Kullanıcı adınız veya şifreniz hatalı. Tekrar deneyiniz.");
                if (right== 0){
                    System.out.println("Hesabınız bloke edilmiştir.Bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: "+ right--);
                }

            }
    }

        /*while (right> 0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password= input.nextLine();
            if (userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba hoşgeldiniz.");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1- Para Yatırma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cıkıs yap");
                    select= input.nextInt();
                    if (select==1){
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select==2 ) {
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        if (price> balance){
                            System.out.print("Bakiye yetersiz ");
                        }else {
                            balance-=price;
                        }
                    }else if (select==3){
                        System.out.print("Bakiyeniz: "+ balance);

                    }
                }while (select!=4);
                System.out.print("İyi günler..");

                break;
            }else{
                right--;
                System.out.println("Kullanıcı adınız veya şifreniz hatalı. Tekrar deneyiniz.");
                if (right== 0){
                    System.out.println("Hesabınız bloke edilmiştir.Bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: "+ right--);
                }

            }


        }*/
    }
}