import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para Tutarını gir :");
        float a = sc.nextFloat();
        if(a>0  && a<=1000){
            System.out.println("KDV'siz Fiyat: "+a);
            System.out.println("KDV'li Fiyat: "+(((a*18)/100)+a));
            System.out.println("KDV Tutarı: "+((a*18)/100));
        }
        else if (a>1000){
            System.out.println("KDV'siz Fiyat: "+a);
            System.out.println("KDV'li Fiyat: "+(((a*8)/100)+a));
            System.out.println("KDV Tutarı: "+((a*8)/100));
        }
        
    }
    
}