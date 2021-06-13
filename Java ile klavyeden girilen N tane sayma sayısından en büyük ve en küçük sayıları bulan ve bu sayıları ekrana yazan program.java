//import java.util.Scanner;
public class JavaProject1 {    
 
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("kac sayi girilecek"); int adim = sc.nextInt(); 
        int maks=0,min=0;
        
        for (int i=1; i<=adim; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = sc.nextInt();
            
            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }
            
            if (sayi>maks)
                maks=sayi;
            
            if (sayi<min)
                min=sayi;
        }
        
        System.out.println("Maks: "+maks);
        System.out.println("Min : "+min);
    }
}