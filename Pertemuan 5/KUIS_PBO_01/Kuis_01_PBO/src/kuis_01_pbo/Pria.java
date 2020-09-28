package kuis_01_pbo;

public class Pria extends Manusia{
    private Wanita istri;
    
    Pria () {
        
    }
    Pria (int umur, String nama, boolean dewasa, Wanita istri) {
        this.umur = umur;
        this.nama = nama;
        this.setDewasa(dewasa);
        this.istri = istri;
    }
    public void aturanUmur (){
        if (umur >= 22) {
            boolean dewasa = true;
            System.out.println("Pria sudah dewasa & mempunyai istri");
        }
        else {
            System.out.println("Pria ini masih kuliah");
        }
    }
    public void setIstri(String istri){
        this.istri.nama = istri;
    }
    public Wanita getIstri(){
        return istri;
    }
    public void info(){
        super.info();
        aturanUmur();
        System.out.println("Informasi Istri");
        System.out.println("Nama Istri: " + istri.nama);
    }
}
