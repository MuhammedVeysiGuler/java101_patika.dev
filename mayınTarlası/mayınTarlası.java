import java.util.Scanner;
class tarla{
    private int [][]tarla = new int[10][10];
    private int satir=0,sutun=0;
    tarla(){
        mayinBelirle(10);
    }
    tarla(int adet){
        mayinBelirle(adet);
    }
    void mayinBelirle(int adet){
        for(int i=0;i<adet;i++){
            satir = (int) (Math.random()*10);
            sutun = (int) (Math.random()*10);
            if(tarla[satir][sutun]==0){
                tarla[satir][sutun]=1;
            }else{
                i--;
            }
        }
    }
    boolean konrtol(int satir,int sutun){
        if(tarla[satir][sutun]==1){
            return true;
        }
        else{
            return false;
        }
    }
    void yazidr(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(tarla[i][j]);
            }
            System.out.println("");
        }
    }
}

//import java.util.Scanner;
public class JavaProject1 {    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tarla t = new tarla();
        int satir,sutun,puan = 0;
        boolean cikis=false;
        t.yazidr();  //oluşturulan mayınlı alanı gösterir.
        do{
            System.out.println("Satir Gir: "); satir=sc.nextInt();
            System.out.println("Sutun Gir: "); sutun=sc.nextInt();
            if(t.konrtol(satir, sutun)){
                cikis=true;
            }else{
                cikis=false;
                puan++;
            }
            System.out.println("Tahmin: "+satir+"-"+sutun);
        }while(cikis==false);
        System.out.print("PUANINIZ:"+puan);
        
    }
}
