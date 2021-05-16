import java.util.Scanner;
public class JavaProject1 {    
    
public static float tutarHesapla(float km){
    float acılıs = (float) 10.0;
    float fiyat = (float) (km*2.20);
    float sonuc = fiyat + acılıs;
    if(sonuc<=20){
        return (float) 20.0;
    }
    return sonuc;
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gidilen km gir: ");
        float km = sc.nextFloat();
        float tutar = tutarHesapla(km);
        System.out.println(tutar+" Tl");
        
    }
    
}