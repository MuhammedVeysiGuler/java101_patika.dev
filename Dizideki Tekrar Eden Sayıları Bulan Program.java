//import java.util.Scanner;
public class JavaProject1 {    
    static void tekrarEden(int arr[], int uzunluk) 
    {
        int i, j;
        System.out.println("Tekrar Eden Sayılar :");
        for (i = 0; i < uzunluk; i++) 
        {
            for (j = i + 1; j < uzunluk; j++) 
            {
                if (arr[i] == arr[j]) 
                    System.out.print(arr[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int uzunluk = arr.length;
        tekrarEden(arr, uzunluk);
    }
}
