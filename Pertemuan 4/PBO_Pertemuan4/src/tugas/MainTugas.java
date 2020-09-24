package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // Memanggil class Penulis untuk Novel
        Penulis s = new Penulis();
        s.setNama("Madani");
        s.setKelahiran("24-12-1998");
        
        // Memanggil class Penerbit untuk Novel
        Penerbit p = new Penerbit();
        p.setNama("Coconut Books");
        p.setAlamat("Depok, Jawa Barat");
        
        // Memanggil class Buku untuk Novel
        Buku b = new Buku();
        b.setKategori("Novel");
        b.setHalaman(476);
        b.setTahunTerbit(2017);
        b.setPenulis(s);
        b.setPenerbit(p);
        
        // MEmanggil class Novel
        Novel n = new Novel();
        n.setJudul("Assalamualaikum Calon Imam");
        n.setGenre("Romance");
        n.setBuku(b);
        System.out.println(n.info());
        
        // Memanggil class Penulis untuk Majalah
        Penulis s1 = new Penulis();
        s1.setNama("Ahmad Tohari DKK");
        s1.setKelahiran("1986");
        
        // Memanggil class Penerbit untuk Majalah
        Penerbit p1 = new Penerbit();
        p1.setNama("yayasan Indonesia");
        p1.setAlamat("Jakarta, Indonesia");
        
        // Memanggil class Buku untuk Majalah
        Buku b1 = new Buku();
        b1.setKategori("Majalah");
        b1.setHalaman(258);
        b1.setTahunTerbit(2016);
        b1.setPenulis(s1);
        b1.setPenerbit(p1);
        
        // Memanggil class Majalah
        Majalah m = new Majalah();
        m.setJudul("Horison 50 Tahun");
        m.setJenis("Sastra");
        m.setBuku(b1);
        System.out.println(m.info());
    }
}
