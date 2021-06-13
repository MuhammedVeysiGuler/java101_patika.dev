
//import java.util.Scanner;
public class JavaProject1 {    
 //eksik var düzgün çalışmıyor
    static void hesapla(int sayi){
        while(true){
            int temp = sayi;
            System.out.println(temp -= 5);
            if(temp>0){
                System.out.println(temp -= 5);
                temp = sayi;
                break;
            }
            else if(temp==0 || temp<0){
                System.out.println(temp += 5); 
                break;
            }
            else if(temp == sayi){
                break;
            }
        
        }
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         hesapla(16);
    }
}