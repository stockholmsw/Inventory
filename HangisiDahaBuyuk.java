package freecodecamp.com;
import java.util.*;
public class HangisiDahaBuyuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("İlk sayı : " );
        a = scanner.nextInt();
        System.out.print("\nİkinci sayı : ");
        b = scanner.nextInt();
        System.out.print("\nÜçüncü sayı : ");
        c = scanner.nextInt();

        if(a>b &&a>c && b>c){
            System.out.println(a + " " +  b + " " + c );
        }else if(b>a && b>c) {
            if(a>c){
                System.out.println(b + " "+ a + " "+ c);
            }else{
                System.out.println(b + " " + c  + " "+ a );
            }
        }else if(c>a && c>b ){
            if(a>b){
                System.out.println(c + " " + a + " "+ b);
            }else{
                System.out.println(c + " " + b  + " " + a );
            }
        }
    }
}
