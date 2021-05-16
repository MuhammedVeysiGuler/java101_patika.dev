import java.util.Scanner;
public class JavaProject1 {    
   public static float hesapla(float a,float e,float d,float m,float p){
       float toplam = 0;
       float armut = (float) (a*2.14);
       float elma = (float) (e*3.67);
       float domates = (float) (d*1.11);
       float muz = (float) (m*0.95);
       float patlican = (float) (p*5.00);
       toplam = armut+elma+domates+muz+patlican;
       return toplam;
   }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,e,d,m,p;
        System.out.print("Armut kac kilo: ");
        a = sc.nextFloat();
        System.out.print("Elma kac kilo: ");
        e = sc.nextFloat();
        System.out.print("Domates kac kilo: ");
        d = sc.nextFloat();
        System.out.print("Muz kac kilo: ");
        m = sc.nextFloat();
        System.out.print("Patlıcan kac kilo: ");
        p = sc.nextFloat();
        System.out.print("Toplam Tutar: "+hesapla(a, e, d, m, p));
    }
    
}