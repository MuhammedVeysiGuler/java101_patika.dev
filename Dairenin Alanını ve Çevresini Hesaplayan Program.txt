import java.util.Scanner;
public class JavaProject1 {    
   static final float PI = 3.14f;
    public static float alanHesapla(int r){
        float sonuc = PI*r*r;
        return sonuc;
    };
    public static float cevreHesapla(int r){
        float sonuc = 2*PI*r;
        return sonuc;
    };
    public static float daireDilimiHesapla(int r,float aci){
        float sonuc = (PI*(r*r)*aci)/360;
        return sonuc;
    };

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yarıçap Gir r :");
        int r = sc.nextInt();
        System.out.print("Açı gir a :");
        float a = sc.nextFloat();
        System.out.println("Alan: "+alanHesapla(r));
        System.out.println("Çevre: "+cevreHesapla(r));
        System.out.println("Daire Dilimi: "+daireDilimiHesapla(r, a));
        
    }
    
}