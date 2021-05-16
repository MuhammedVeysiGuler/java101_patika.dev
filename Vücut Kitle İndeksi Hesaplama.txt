import java.util.Scanner;
public class JavaProject1 {    
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        float boy = sc.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz: ");
        float kilo = sc.nextFloat();
        float kitleIndexi = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+kitleIndexi);
        
    }
    
}