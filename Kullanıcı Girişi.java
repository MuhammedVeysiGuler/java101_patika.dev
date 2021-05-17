import java.util.Scanner;
public class JavaProject1 {    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kullaniciAdi = "Muhammed";
        int sifre = 12345;
        System.out.print("Kullanici adinizi giriniz: ");
        String ad = sc.nextLine();
        System.out.print("Sifreyi giriniz: ");
        int sifreGiris = sc.nextInt();
        if(ad.equals(kullaniciAdi) && sifreGiris == sifre){
            System.out.println("hosgeldiniz");
        }else{
            System.out.println("Giriş Başarısız");
            System.out.print("Sifrenizi sıfırlamak ister misiniz? 1-evet||2-hayır: ");
            int deger = sc.nextInt();
            switch(deger){
                case 1:
                    System.out.print("Yeni sifrenizi giriniz: ");
                    int yeniSifre = sc.nextInt();
                    if(yeniSifre == sifre || yeniSifre == sifreGiris){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }else{
                        System.out.println("Sifre olusturuldu");
                        sifre = yeniSifre;
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama iptal edildi");
                    break;
                default:
                    System.out.println("Belirtilen bir değer seçiniz!!");
            }
        }
    }
    
}