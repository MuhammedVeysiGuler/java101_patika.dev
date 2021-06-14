//import java.util.Scanner;
public class JavaProject1 {    
    
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] list = {56, 34, 1, 8, 101, -2, -33};
      
        int min1 = list[0];
        int min2 = list[1];
        int max1 = list[0];
        int max2 = list[1];

        for (int i : list) {
            if (i < min1) {
                min2 = min1;
                min1 = i;
            }else if(i<min2){
                min2 = i;
            }
            if (i > max1) {
                max2 = max1;
                max1 = i;
            }else if(i>max2){
                max2 = i;
            }
        }

        System.out.println("Minimum Değer " + min1);
        System.out.println("Minimum 2.Değer " + min2);
        System.out.println("Maximum Değer " + max1);
        System.out.println("Maximum 2.Değer " + max2);
    }
}