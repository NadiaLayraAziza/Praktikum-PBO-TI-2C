package Tugas;

public class Main_Tugas {
    
    public static void main(String[] args) {
        
        Mac m = new Mac ("IBOX Macbook Air 2020", 2, 8, "Intel i3", "Lithium-Polymer", "Chip");
        System.out.println("\n================== Data Mac ===================");
        m.tampilMac();
        
        Windows w = new Windows("ASUS TUF Gaming FX505GE", 4, 8, "Intel Core i5-8300H", "3 -Cell 48 Wh Battery", "Eksklusif dan Premium");
        System.out.println("\n================= Data Windows ================");
        w.tampilWindows();
        
        Pc p = new Pc("Microsoft Surface Studio", 5, 16, "Intel Core i5", 28);
        System.out.println("\n=================== Data PC ===================");
        p.tampilPc();
        
    }
}
