package belajarunittesting;

import org.junit.Assert;
import org.junit.Test;

public class PengolahPesanTest {
    // Subjek Uji
    private final PengolahPesan pengolahPesan;
    
    public PengolahPesanTest(){
        this.pengolahPesan = new PengolahPesan();
        this.pengolahPesan.setPengirim("Adi");
        this.pengolahPesan.setPenerima("Budi");
        this.pengolahPesan.setPesan("Halo!");      
    }
    
    @Test
    public void testHitungPanjangPesan(){
        System.out.println("* Menguji unit: testHitungPanjangPesan()");
        
        // "Halo!" <-- Panjangnya 5 karakter
        int hasilSeharusnya = 5;
        
        //Uji methodnya..
        Assert.assertEquals(
            hasilSeharusnya,
            this.pengolahPesan.hitungPanjangPesan()
        );
        
        System.out.println("* Tes OK!");
    }
    
    @Test
    public void testRangkaiPesan(){
        System.out.println("* Menguji unit: testRangkaiPesan()");
        
        // Halo Budi, Anda mendapat pesan dari Adi! Berikut pesannya:\nHalo!
        String hasilSeharusnya = "Halo Budi, Anda mendapat pesan dari Adi! "
                + "Berikut pesannya:\nHalo!";
        
        // Uji methodnya..
        Assert.assertEquals(
            hasilSeharusnya,
            this.pengolahPesan.rangkaiPesan()
        );
        System.out.println("* Tes OK!");
    }
}
