package pbo_pertemuan12;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik",500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto",5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e;
        IPayable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
