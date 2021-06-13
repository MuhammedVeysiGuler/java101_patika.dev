//import java.util.Scanner;
public class JavaProject1 {    
 
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Taban Sayi Gir: ");
        int sayiTaban = sc.nextInt();
        int b = sayiTaban;
        System.out.print("Üs olan sayiyi gir: "); int usSayi = sc.nextInt();
        for(int i=1;i<usSayi;i++){
            b = sayiTaban*b;
        }
        System.out.println("Sonuc: "+b);
        
    }
}
