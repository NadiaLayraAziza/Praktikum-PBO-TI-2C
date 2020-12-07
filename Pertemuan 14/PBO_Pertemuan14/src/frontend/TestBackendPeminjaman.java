package frontend;

import backend.*;

public class TestBackendPeminjaman {
    public static void main(String[] args){
        Anggota ang = new Anggota().getById(1);
            Buku buku = new Buku().getById(2);
            Peminjaman pem = new Peminjaman(ang, buku, "2020/11/28", "2000/12/08");
            
            // test update
            pem.setTanggalKembali("2020/12/10");
            pem.save();
            
            // test select all
            for(Peminjaman p : new Peminjaman().getAll())
            {
                System.out.println("IDAnggota: " + p.getAnggota().getIdAnggota() + ", ID Buku: " + p.getBuku().getIdbuku());
            }
    }
}
