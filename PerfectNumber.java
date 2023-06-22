package freecodecamp.com;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        // Mükemmel sayı kodlarını yazma
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı girin : ");
        long sayi, toplam = 0;
        sayi = scan.nextLong();

        for(int i = 1;i<sayi;i++){
            if(sayi%i==0) {
                System.out.print( i + " ");
                toplam = toplam+i;
            }
        }
        if(sayi == toplam){
            System.out.println("\nGirdiğiniz sayı " + sayi + " Mükemmel sayıdır");
        }else{
            System.out.println( "\n " + sayi + " Mükemmel sayı değildir");
        }
    }
}
