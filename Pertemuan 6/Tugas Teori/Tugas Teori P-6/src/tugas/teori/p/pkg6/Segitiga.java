package tugas.teori.p.pkg6;

public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;

    public float luas() {
        float luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    
    public float keliling(){
        double sisi = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
        float keliling = (float) (alas+tinggi+sisi);
        System.out.println("Keliling Segitiga = " + keliling);
        return keliling;
    }
    
}
