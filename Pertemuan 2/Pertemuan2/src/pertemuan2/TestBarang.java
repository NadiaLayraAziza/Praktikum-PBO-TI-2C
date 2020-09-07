package pertemuan2;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "Mkn2";
        brg.namaBarang = "Roti Sobek";
        brg.hargaDasar = 250000;
        brg.diskon = 35;
        brg.hitungHargaJual();
        brg.tampilBarang();
    }
    
}
