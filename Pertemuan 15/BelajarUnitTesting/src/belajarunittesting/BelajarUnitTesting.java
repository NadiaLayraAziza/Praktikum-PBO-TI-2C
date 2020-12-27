package belajarunittesting;

public class BelajarUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PengolahPesan pp = new PengolahPesan();
        pp.setPengirim("Adi");
        pp.setPenerima("Budi");
        pp.setPesan("Halo, apa kabar Bro?");
        pp.tampilkanPesan();
        System.out.println("Total Panjang Pesan: " + pp.hitungPanjangPesan());
    }
}
