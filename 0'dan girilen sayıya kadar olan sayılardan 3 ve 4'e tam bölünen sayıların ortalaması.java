//import java.util.Scanner;
public class JavaProject1 {    
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Sayi Gir "); int sayi = sc.nextInt();
        int uceBolunen=0,dordeBolunen=0,ucSayac=0,dortsayac=0;
        for(int i=0;i<=sayi;i++){
            if(i%3 == 0){
               uceBolunen += i;
               ucSayac++;
            }
            if(i%4 == 0){
                dordeBolunen +=i;
                dortsayac++;
            }
        }
        int ort = (uceBolunen+dordeBolunen)/(ucSayac+dortsayac);
        System.out.println("Ortlama: "+ort);
    }
}