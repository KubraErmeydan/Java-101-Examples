public class Main {

    static int power(int base, int exp){
        int result = 1;
        for (int i= 1;i<= exp;i++ ){
            result*= base;
        }
        return result;
    }

    static void helloWorld(){
        System.out.println("Hİ Guys!!");
    }


    public static void main(String[] args) {
        helloWorld();
        System.out.println(power(2,3));
        System.out.println(power(4,2));
    }
}