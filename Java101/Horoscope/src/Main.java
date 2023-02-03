import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What month were you born");
        int month = input.nextInt();
        System.out.println("What day were you born");
        int day = input.nextInt();
        String horoscope;
        if(month == 1){
            if(day <= 20 ){
                horoscope = "Capricorn";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Aquarius";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 2){
            if(day <= 19){
                horoscope = "Aquarius";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Pisces";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 3){
            if(day <= 20){
                horoscope = "Pisces";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Aries";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 4){
            if(day <= 20){
                horoscope = "Aries";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Taurus";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 5){
            if(day <= 21){
                horoscope = "Taurus";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Gemini";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 6){
            if(day <= 21){
                horoscope = "Gemini";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Cancer";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 7){
            if(day <= 23){
                horoscope = "Cancer";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Leo";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 8){
            if(day <= 23){
                horoscope = "Leo";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Virgo";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 9){
            if(day <= 23){
                horoscope = "Virgo";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Libra";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 10){
            if(day <= 23){
                horoscope = "Libra";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Scorpio";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 11){
            if(day <= 22){
                horoscope = "Scorpio";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Sagittarius";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        else if(month == 12){
            if(day <= 22){
                horoscope = "Sagittarius";
                System.out.println("Your horoscope is " + horoscope);
            }
            else{
                horoscope = "Capricorn";
                System.out.println("Your horoscope is " + horoscope);
            }
        }
        if (month > 12 || day > 31){
            System.out.println("The information you entered is invalid!");
        }


    }

}