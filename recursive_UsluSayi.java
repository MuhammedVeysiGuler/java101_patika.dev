//import java.util.Scanner;
public class JavaProject1 {    
 
    static int usluSayi(int x, int y) {
	if(y>1) {
		x = x*usluSayi(x,y-1);
	}
        return x;
}
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println(usluSayi(5, 2));
    }
}
