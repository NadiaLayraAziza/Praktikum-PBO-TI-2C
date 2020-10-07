package tugas.teori.p.pkg6;

public class Lingkaran extends BangunDatar{
    
    float r;
    
    public float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran = " + luas);
        return luas;
    }
    
    public float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran = " + keliling);
        return keliling;
    }
}
