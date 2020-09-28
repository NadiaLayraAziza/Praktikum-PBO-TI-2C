package kuis_01_pbo;

public class Wanita extends Manusia{
    private Pria suami;
    public Manusia anak;
    
    Wanita () {
        
    }
    Wanita (int umur, String nama, boolean dewasa, Pria suami, Manusia anak) {
        this.umur = umur;
        this.nama = nama;
        this.setDewasa(dewasa);
        this.suami = suami;
        this.anak = anak;
    }
    public void aturanUmur (){
        if (umur >= 20) {
            boolean dewasa = true;
            System.out.println("Wanita sudah dewasa & mempunyai suami");
        }
        else {
            System.out.println("Wanita ini masih kuliah");
        }
    }
    public void setSuami(String suami){
        this.suami.nama = suami;
    }
    public Pria getSuami(){
        return suami;
    }
    public void setAnak(Manusia anak){
        this.anak = anak;
    }
    public Manusia getAnak(){
        return anak;
    }
    public void info(){
        super.info();
        aturanUmur();
        System.out.println("Informasi Suami");
        System.out.println("Nama Suami: " + suami.nama);
        System.out.println("Informasi Anak");
        anak.info();
    }
}
