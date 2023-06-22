package freecodecamp.com;
import java.util.*;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double toplam = 0;

       // Java ile girilen sayının harmonik serisini bulan program yazacağız.

        // 1+ 1/2 + 1/3+ 1/4+ 1/n;

        for(int i = 1;i<=n;i++){
            toplam  = toplam+(1.0/i);
        }

        System.out.println(toplam);

         for(int i = 2;i<=2;i++){
             for(int j = 1 ;j<=10;j++){
                 System.out.println(i + " * " + j  +" =  " + (i*j));
             }
         }
         //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız
        for(int i = 2;i<=100;i++){
            boolean isPrime = true;
            for(int j = 2;j<i;j++){
                if(i%j ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i +  " ");
            }
        }

    }
}
