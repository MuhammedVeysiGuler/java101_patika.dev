class Employee{
    String name;
    int salary,workHours,hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
        this.hireYear = hireYear;
        this.name = name;
        this.salary= salary;
        this.workHours=workHours;
    }
    int tax(){
        int vergi = 0;
        if(this.salary <1000){
            System.out.println("Vergi uygulanmıyor");
        }else{
            vergi = (int) (this.salary*0.03);
        }
        return vergi;
    }
    int bonus(){
        int bonus = 30*this.workHours;
        return bonus;
    }
    int raiseSalary(){
        int fark = 2021-this.hireYear;
        int zam = 0;
        if(fark<10){
            zam = (int) (this.salary*0.05);
        }else if(fark>9 && fark<20){
            zam = (int) (this.salary*0.10);
        }else{
            zam = (int) (this.salary*0.15);
        }
       return zam;      
    }
    int genelMaas(){
        int maas = this.salary-tax()+bonus();
        return maas;
    }
    int toplamMaas(){
        int toplam = this.salary+raiseSalary();
        return toplam;
    }
    
    public String toString(){
        return "Adı: "+this.name+
                "\nMaaşı: "+this.salary+
                "\nÇalışma Saati: "+this.workHours+
                "\nBaşlangıç Yılı: "+this.hireYear+
                "\nVergi: "+this.tax()+
                "\nBonus: "+this.bonus()+
                "\nMaaş Artışı: "+this.raiseSalary()+
                "\nVergi ve Bonuslar ile birlikte maaş: "+genelMaas()+
                "\nToplam Maaş: "+toplamMaas();
    }
}


//import java.util.Scanner;
public class JavaProject1 {    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Employee e = new Employee("Muhammed", 2000, 45, 1985);
         System.out.println(e.toString());
        
    }
}
