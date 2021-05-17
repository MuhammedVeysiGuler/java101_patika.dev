import java.util.Scanner;
public class JavaProject1 {    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float matOrtalama = 0,turkceOrtalama=0,fizikOrtalama=0,kimyaOrtalama=0;
        int adet;
        System.out.println("Matematik notlarını giriniz: ");
        System.out.print("1.not");  int n1 = sc.nextInt();
        System.out.print("2.not");  int n2 = sc.nextInt();
        System.out.print("3.not");  int n3 = sc.nextInt();
        if(n1>0 && n1<100 && n2>0 && n2<100 && n3>0 && n3<100){
            matOrtalama = (n1+n2+n3)/3;
        }
        
        System.out.println("Fizik notlarını giriniz: ");
        System.out.print("1.not");  int f1 = sc.nextInt();
        System.out.print("2.not");  int f2 = sc.nextInt();
        System.out.print("3.not");  int f3 = sc.nextInt();
        if(f1>0 && f1<100 && f2>0 && f2<100 && f3>0 && f3<100){
            fizikOrtalama = (f1+f2+f3)/3;
        }
        
        System.out.println("Türkçe notlarını giriniz: ");
        System.out.print("1.not");  int t1 = sc.nextInt();
        System.out.print("2.not");  int t2 = sc.nextInt();
        System.out.print("3.not");  int t3 = sc.nextInt();
        if(t1>0 && t1<100 && t2>0 && t2<100 && t3>0 && t3<100){
            turkceOrtalama = (t1+t2+t3)/3;
        }
        
        System.out.println("Kimya notlarını giriniz: ");
        System.out.print("1.not");  int k1 = sc.nextInt();
        System.out.print("2.not");  int k2 = sc.nextInt();
        System.out.print("3.not");  int k3 = sc.nextInt();
        if(k1>0 && k1<100 && k2>0 && k2<100 && k3>0 && k3<100){
            kimyaOrtalama = (k1+k2+k3)/3;
        }
        float genelOrtalama = (fizikOrtalama+kimyaOrtalama+matOrtalama+turkceOrtalama)/4;
        if (genelOrtalama>55) {
            System.out.println("Sınıfı geçtiniz!! ortalamanız: "+genelOrtalama);
        }else{
            System.out.println("Sınıfı geçemediniz!! ortalamanız: "+genelOrtalama);
        }
    }
    
}