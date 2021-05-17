import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sıcaklık kaç derece ?: ");
       int sicaklik = sc.nextInt();
        if (sicaklik<=5){
            System.out.println("Kayak");
        }else if(sicaklik>5 || sicaklik<=15){
            System.out.println("Sinema");
        }else if(sicaklik>10 || sicaklik<=25){
            System.out.println("Piknik");
        }else if(sicaklik>25){
            System.out.println("Yüzme");
        }
    }
    
}
