//import java.util.Scanner;
public class JavaProject1 {    
    static float harmonikDizi(float arr[], int n)
    {
        float toplam = 0;
        for (int i = 0; i < n; i++)
            toplam = toplam + (float)1 / arr[i];
      
        return (float)n/toplam;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float arr[]= { 17.5f, 23.3f, 32.2f};
        int n = arr.length;
        System.out.println("Harmonik Dizi Sonucu: "+harmonikDizi(arr, n));
    }
}
