package tugaspertemuan3;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    Anggota(String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public void setNoKtp(String noKtp){
        this.noKtp = noKtp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public String getNoKtp(){
        return noKtp;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int pinjam){
        if (pinjam < 5000000){
            jumlahPinjaman += pinjam;
        }
        else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    public void angsur(int angsur){
        if (angsur >= ((jumlahPinjaman*10)/100)){
            jumlahPinjaman -=angsur;
        }
        else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
