package tugas;

public class Penerbit {
    private String nama;
    private String alamat;
    
    Penerbit(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public String info(){
        String info = "\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        return info;
    }
}
