package Tugas_Pertemuan_4;

public class DaftarGaji {
    
    public Pegawai[] listPegawai;
    public int jumlahPegawai = 0;
    
    public DaftarGaji(int nPegawai){
        listPegawai = new Pegawai[nPegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawai] = p;
        jumlahPegawai++;
    }
    
    public void printSemuaGaji(){
        System.out.println("========== Daftar Gaji ==========");
        for (int i=0;i<jumlahPegawai;i++){
            System.out.print(listPegawai[i].getNama()+" = Rp ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
