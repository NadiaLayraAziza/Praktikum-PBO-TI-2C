package kuis_02_pbo;

public abstract class MediaInformasi implements IPenerbit {
    public int jmlHalaman;
    private int tahunSekarang;
    
    public int getTahunSekarang(int tahun){
        return this.tahunSekarang = tahun;
    }
    public void setJMLHalaman( int jml){
        this.jmlHalaman = jml;
    }
    @Override
    public abstract void reputasi();
    
    @Override
    public void alamatPenerbit(String alamat){
        System.out.println("\nAlamat Penerbit: " + alamat);
    }
    @Override
    public void tahunBerdiri(int tahun){
        System.out.println("\nPenerbit ini berdiri pada tahun: " + tahun + 
                ", sehingga Penerbit ini sekarang berusia: " + 
                (this.tahunSekarang - tahun) + " tahun");
    }
    
}
