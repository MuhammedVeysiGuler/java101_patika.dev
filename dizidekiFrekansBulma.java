import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dizi[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
        List<Integer> diziListesi = new ArrayList<>();
        List<Integer> diziListesiYedek = new ArrayList<>();
        List<Integer> sayiAdetleri = new ArrayList<>();
        List<String> sayiAdetleriYedek = new ArrayList<>();
        for(int i = 0; i < dizi.length; i++) {
            diziListesi.add(dizi[i]);
            diziListesiYedek.add(dizi[i]);
        }
        diziListesi = diziListesi.stream().distinct().sorted().collect(Collectors.toList());
        diziListesi.forEach(i->{
            System.out.print(i);
            sayiAdetleri.add(0);
        });
        int index = 0;
        for(int i = 0; i < diziListesi.size(); i++) {
            index = 0;
            for(int j = 0; j < diziListesiYedek.size(); j++) {
                if(diziListesiYedek.get(j) == diziListesi.get(i)) {
                    index++;
                    
                }
            }
            sayiAdetleri.set(i, index);
        }
        for(int i = 0; i < diziListesi.size(); i++) {
            System.out.println(diziListesi.get(i) + "sayısından şu kadar var : " + sayiAdetleri.get(i));
        }
    }
}