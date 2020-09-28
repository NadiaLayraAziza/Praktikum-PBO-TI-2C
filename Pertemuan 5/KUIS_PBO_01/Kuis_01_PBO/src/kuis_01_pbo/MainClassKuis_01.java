package kuis_01_pbo;

public class MainClassKuis_01 {

    public static void main(String[] args) {
        Manusia a = new Manusia();
        Pria p = new Pria();
        Wanita w = new Wanita(24, "Aziza", true, p, a);
        p = new Pria(28, "Muhammad", true, w);
        System.out.println("Running Sebagai Pria");
        p.info();
        
        a = new Manusia(19, "Nadia", false);
        Pria p1 = new Pria();
        p1.setNama("Bisri");
        Wanita w1 = new Wanita(22, "Layra", true, p1, a);
        p1 = new Pria(30, "Bisri", true, w1);
        
        System.out.println("\nRunning Sebagai Wanita");
        w1.info();
        
    }
}
