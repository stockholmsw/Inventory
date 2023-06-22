package freecodecamp.com;
import java.util.*;

public class DizideTekrarEdenSayilar {
    public static void main(String[] args) {
        // Tek boyutlu dizi tanımı
        int[]arr = {1,6,9,8,8,8,2,5,4,4,7,3};
        int startIndex = 0;
        int dublicateArr[] = new int[arr.length];
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j<arr.length;j++){
               if(i!=j && (arr[i] == arr[j])){
                   if(!hasGot(arr,arr[i])){
                       dublicateArr[startIndex++] = arr[i];
                       break;
                   }
                }
            }
        }

        for(int a : dublicateArr){
            System.out.print(a + " ");
        }
    }
    static boolean hasGot(int arr[],int value){
        for(int i :arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

}
