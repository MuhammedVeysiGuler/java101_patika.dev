import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Not ortalamsını gir :");
        int a = sc.nextInt();
        if(a>=60){
            System.out.println("Dersi geçtin");
        }
        else{
            System.out.println("Dersten kaldın");
        }
        
    }
    
}