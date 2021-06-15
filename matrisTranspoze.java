//import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;  
    System.out.println("Kac satir kac sutun olacak gir: ");  
    int satir = sc.nextInt();  
    int sutun = sc.nextInt();  
    int dizi[][] = new int[satir][sutun];  
    System.out.println("Soldan saga matrisi yaz:");  
    for(i = 0; i < satir; i++)  
    {  
        for(j = 0; j < sutun; j++)   
            {  
            dizi[i][j] = sc.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("Girdiğin Matris ");  
    for(i = 0; i < satir; i++)  
        {  
            for(j = 0; j < sutun; j++)  
            {  
            System.out.print(dizi[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("Transpoz Matris ");  
    for(i = 0; i < sutun; i++)  
        {  
            for(j = 0; j < satir; j++)  
            {  
                System.out.print(dizi[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }
}
