package pertemuan2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    public int hargaBayar;
    
    public int hitungHarga(){
        hargaBayar = lamaSewa*harga;
        return hargaBayar;
    }
    public void tampilData(){
        System.out.println("ID member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga Bayar : Rp " + hargaBayar);
    }
    
    
    
}
