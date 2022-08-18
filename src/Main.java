import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        sayi = giris.nextInt();

        for (int i = 1; i<sayi; i++){
            if(sayi % i ==0){
                toplam += i;
                System.out.println(i);
            }
        }
        if(sayi == toplam){
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }


    }
}
