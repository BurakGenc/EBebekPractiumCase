
public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary<1000){
            return 0;
        }
        else
            return (this.salary*3)/100;
    }

    public double bonus(){
        double bonus=0;
        if(this.workHours>40){
            bonus = (this.workHours-40)*30;
            return bonus;
        }
        return bonus;
    }

    public double raiseSalary(){
        int now =2021;
        // vergi ve bonus eklenmis net maas
        double NetSalary=this.salary+this.bonus()-this.tax();

        if(now-this.hireYear<10){
            //this.salary += ((this.salary*5)/100);
            return ((NetSalary*5)/100);
        }
        else if (now-this.hireYear>9 && now-this.hireYear<20) {
            return ((NetSalary*10)/100);
        }
        else{
            return (NetSalary*15)/100;
        }
    }

    public String toString(){

        // vergi ve bonus eklenmis net maas
        double NetSalary=this.salary+this.bonus()-this.tax();

        // Maas artisi eklendikten sonra toplam maas
        double TotalSalary=NetSalary+this.raiseSalary();

        System.out.println(
                "Calisan Adi:"+this.name
                +"\nBrut Maas:"+this.salary
                +"\nVergi:"+this.tax()
                +"\nCalisma Saati:"+this.workHours
                +"\nBonus:"+this.bonus()
                +"\nNet Maas:"+NetSalary
                +"\nBaslangic Yili:"+this.hireYear
                +"\nMaas Artisi:"+this.raiseSalary()
                +"\nZam Sonrasi Net Maas:"+TotalSalary);

        return this.name;

    }

}
