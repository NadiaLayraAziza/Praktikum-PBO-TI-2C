package Tugas_Pertemuan_4;

public class Pegawai {
 
    public String nip;
    public String nama;
    public String alamat;
    
    Pegawai(){
        
    }
 
    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getGaji(){        
        return 2500000;
    }
}
