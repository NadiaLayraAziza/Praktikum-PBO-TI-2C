package tugas;

public class Penulis {
    private String nama;
    private String kelahiran;
    
    Penulis(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKelahiran(String kelahiran){
        this.kelahiran = kelahiran;
    }
    public String getKelahiran(){
        return kelahiran;
    }
    public String info(){
        String info = "\n";
        info += "Nama: " + nama + "\n";
        info += "Kelahiran: " + kelahiran;
        return info;
    }
    
}
