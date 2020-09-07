package pertemuan2;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman gm = new Peminjaman();
        gm.id = 1503;
        gm.namaMember = "Nadia Layra";
        gm.namaGame = "Mobile Legends";
        gm.lamaSewa = 2;
        gm.harga = 50000;
        gm.hitungHarga();
        gm.tampilData();
    }
}
