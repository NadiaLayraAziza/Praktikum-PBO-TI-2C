package pertemuan2;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargaJual;
    
    public int hitungHargaJual(){
        hargaJual = (int)(hargaDasar - (hargaDasar*diskon/100));
        return hargaJual;
    }
    public void tampilBarang(){
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Dasar     : Rp " + hargaDasar);
        System.out.println("Diskon          : " + diskon + " %");
        System.out.println("Harga Bayar     : Rp " + hargaJual);
    }
}
