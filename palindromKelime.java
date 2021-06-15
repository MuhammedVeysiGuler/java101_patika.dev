//import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sayac = 0;
        System.out.print("Kelime giriniz: ");
        String kelime = sc.nextLine();
        String yeniKelime = "";
        
        for(int i = (kelime.length()-1); i >= 0; i--)
        {
            yeniKelime += kelime.charAt(i);
        }
        if(yeniKelime.equals(kelime)) {
            System.out.println("Palindrom.");
        }
        else {
            System.out.println("Palindrom değil.");
        }
        
    }
}
