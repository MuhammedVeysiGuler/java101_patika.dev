import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.kenarı gir :");
        int a = sc.nextInt(); 
        System.out.println("2. kenarı gir :");
        int b = sc.nextInt();
        System.out.println("3. kenarı gir :");
        int c = sc.nextInt();
        int u = ((a+b+c)/2);
        int cevre = 2*u;
        int alanKaresi = u*(u-a)*(u-b)*(u-c);
        int alan = (int) Math.sqrt(alanKaresi);
        System.out.println("Üçgenin Alanı : "+alan);
        
    }
    
}