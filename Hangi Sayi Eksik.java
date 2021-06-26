//import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class JavaProject1 {    

    public static List<Integer>
    
        bul(int[] dizi){
        for (int i = 0; i < dizi.length; i++) { //dizi uzunlugu kadar dongu donduruyorum
            int toplam = Math.abs(dizi[i]);  //dizide negatif değer varsa pozitif yapmak için
            //System.out.println(index);  //index'i görmek için
            if (dizi[toplam - 1] > 0) {
                dizi[toplam - 1] *= -1;  //dizinin toplamından her elemanını negatif yapıyorum
            }
        }
        
        List<Integer> eksikSayi = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > 0) {
                eksikSayi.add(i + 1); //negatif yaptığım kısmı toplayarak sonucu buluyorum
            }
        }
        return eksikSayi;
    }
    
    public static void main(String[] args) {
       int[] dizi = { 1, 2, 4, 5, 6 }; //dizi tanımlandı 
        System.out.println(bul(dizi));     //ekrana yazdırdım
    }
}