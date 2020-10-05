package Tugas_Pertemuan_4;

public class Main_Tugas {
    
    public static void main(String[] args) {
     
        Dosen d1 = new Dosen();
        d1.setNama("Nadia");
        d1.setSKS(15);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Layra");
        
        DaftarGaji dg = new DaftarGaji(3);
        dg.addPegawai(d1);
        dg.addPegawai(p1);
        dg.printSemuaGaji();
    } 
}
