//import java.util.Scanner;
public class JavaProject1 {    
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int toplam=0;
        int sayi;
        do {
            System.out.println("Sayi gir: "); sayi = sc.nextInt();
            if(sayi%2 == 0 && sayi%4 == 0){
                toplam += sayi;
            }
        } while (sayi%2==0);
        System.out.println("Toplam : "+toplam);
         
         
    }
}