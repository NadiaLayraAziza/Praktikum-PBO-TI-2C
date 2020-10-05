package Tugas_Pertemuan_4;

public class Dosen extends Pegawai{
 
    public int jumlahSKS;
    public int TARIF_SKS = 120000;
    
    Dosen(){
        
    }
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    public int getGaji(){
        int total_gaji = jumlahSKS*TARIF_SKS;
        return total_gaji+super.getGaji();
    }
}
