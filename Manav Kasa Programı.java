import java.util.Scanner;
public class JavaProject1 {
   private static final float ARMUT_KILO_FIYAT = 2.14;
   private static final float ELMA_KILO_FIYAT = 3.67;
   private static final float DOMATES_KILO_FIYAT = 1.11;
   private static final float MUZ_KILO_FIYAT = 0.95;
   private static final float PATLICAN_KILO_FIYAT = 5.00;
   public static float hesapla(float kiloArmut, float kiloElma, float kiloDomates, float kiloMuz, float kiloPatlican){
       float toplam = 0;
       toplam += (float) (kiloArmut * ARMUT_KILO_FIYAT);
       toplam += (float) (kiloElma * ELMA_KILO_FIYAT);
       toplam += (float) (kiloDomates * DOMATES_KILO_FIYAT);
       toplam += (float) (kiloMuz * MUZ_KILO_FIYAT);
       toplam += (float) (kiloPatlican * PATLICAN_KILO_FIYAT);
       return toplam;
   }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican;
        System.out.print("Armut kac kilo: ");
        kiloArmut = sc.nextFloat();
        System.out.print("Elma kac kilo: ");
        kiloElma = sc.nextFloat();
        System.out.print("Domates kac kilo: ");
        kiloDomates = sc.nextFloat();
        System.out.print("Muz kac kilo: ");
        kiloMuz = sc.nextFloat();
        System.out.print("Patlıcan kac kilo: ");
        kiloPatlican = sc.nextFloat();
        System.out.print("Toplam Tutar: "+hesapla(kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican));
    }
    
}
