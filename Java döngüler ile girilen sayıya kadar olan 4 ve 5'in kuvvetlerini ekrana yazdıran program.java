//import java.util.Scanner;
public class JavaProject1 {    
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Sayi gir: ");
        int sayi = sc.nextInt();
        for(int i=1;i<=sayi;i++){
            System.out.print("4'üncü katı :"+Math.pow(i, 4));
            System.out.print("\t5'inci katı : "+Math.pow(i, 5));
            System.out.println("");
        }
    }
}