import java.util.Scanner;
public class JavaProject1 {    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayiyi gir: ");   int s1 = sc.nextInt();
        System.out.print("2. sayiyi gir: ");   int s2 = sc.nextInt();
        System.out.print("3. sayiyi gir: ");   int s3 = sc.nextInt();
       if(s1>s2 && s1>s3 && s2>s3){
           System.out.println("buyukten kucuge: "+s1+s2+s3);
       }else if(s1>s2 && s1>s3 && s3>s2){
           System.out.println("buyukten kucuge: "+s1+s3+s2);
       }else if(s2>s1 && s2>s1 && s1>s3){
           System.out.println("buyukten kucuge: "+s2+s1+s3);
       }else if(s2>s1 && s2>s1 && s3>s1){
           System.out.println("buyukten kucuge: "+s2+s3+s1);
       }else if(s3>s1 && s3>s2 && s1>s2){
           System.out.println("buyukten kucuge: "+s3+s1+s2);
       }else if(s3>s1 && s3>s2 && s2>s1){
           System.out.println("buyukten kucuge: "+s3+s2+s1);
       }
    }
}
