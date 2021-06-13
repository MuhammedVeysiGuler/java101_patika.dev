//import java.util.Scanner;
public class JavaProject1 {    
 
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Sayi Gir: "); int sayi = sc.nextInt();
         System.out.println(fib(sayi));
    }
}