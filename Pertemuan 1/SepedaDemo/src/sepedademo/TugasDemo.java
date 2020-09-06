package sepedademo;

public class TugasDemo extends Kasur
{
    public static void main(String[] args) {
        //Buat objek kasur, mesin cuci, dan lemari baju
        Kasur ksr1 = new Kasur();
        KasurSpringBad ksr2 = new KasurSpringBad();
        KasurBusa ksr3 = new KasurBusa();
        MesinCuci msn = new MesinCuci();
        LemariBaju lmr = new LemariBaju();
        
        //Panggil method di dalam objek Kasur
        ksr1.serMerek("Florence");
        ksr1.tambahPanjang(150);
        ksr1.kurangiPanjang(50);
        ksr1.tambahLebar(100);
        ksr1.kurangiLebar(25);
        ksr1.luasKasur();
        ksr1.cetakStatus();
        
        //Panggil method di dalam objek Kasur Spring Bad
        ksr2.serMerek("Comforta");
        ksr2.setJenisPegas("Bonnel");
        ksr2.setPadding("Extra Hard");
        ksr2.tambahPanjang(200);
        ksr2.kurangiPanjang(75);
        ksr2.tambahLebar(120);
        ksr2.kurangiLebar(50);
        ksr2.luasKasur();
        ksr2.cetakStatus();
        
        //Panggil method di dalam objek Kasur Busa
        ksr3.serMerek("Belgium");
        ksr3.setTingkatKelembutan("Medium Soft");
        ksr3.setKepadatan(23);
        ksr3.tambahPanjang(180);
        ksr3.kurangiPanjang(30);
        ksr3.tambahLebar(150);
        ksr3.kurangiLebar(20);
        ksr3.luasKasur();
        ksr3.cetakStatus();
        
        //Panggil method di dalam objek Mesin Cuci
        msn.serMerek("Polytron");
        msn.tambahKapasitas(20);
        msn.kurangiKapasitas(8);
        msn.tambahKecepatan(30);
        msn.kurangiKecepatan(10);
        msn.cetakStatus();
        
        //Panggil method di dalam objek Lemari Baju
        lmr.serWarna("Coklat");
        lmr.serBahan("Kayu Solid");
        lmr.tambahbaju(30);
        lmr.kurangiBaju(8);
        lmr.cetakStatus();
    }
}
