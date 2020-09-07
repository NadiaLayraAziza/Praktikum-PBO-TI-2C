package pertemuan2;

public class Lingkaran {
    static double phi;
    public double r;
    public double luas;
    public double keliling;
    
    public double hitungLuas(){
        luas = phi*r*r;
        System.out.println("Luas = " + luas);
        return luas;
    }
    public double hitungKeliling(){
        keliling = 2*phi*r;
        System.out.println("Keliling = " + keliling);
        return keliling;
    }
}
