package tugas.teori.p.pkg6;

public class Main {
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bd = new BangunDatar();
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran l = new Lingkaran();
        l.r = 18;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 15;
        pp.lebar = 7;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga sg = new Segitiga();
        sg.alas = 10;
        sg.tinggi = 6;
        
        
        // memanggil method luas dan keliling
        bd.luas();
        bd.keliling();
        System.out.println("===============================");
        
        l.luas();
        l.keliling();
        System.out.println("===============================");
        
        pp.luas();
        pp.keliling();
        System.out.println("===============================");
        
        sg.luas();
        sg.keliling();
        System.out.println("===============================");
    }
}
