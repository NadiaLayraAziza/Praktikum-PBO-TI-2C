package pertemuan2;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();
        lk.phi = 3.14;
        lk.r = 6;
        System.out.println("R = " + lk.r);
        lk.hitungLuas();
        lk.hitungKeliling();
    }
    
}
