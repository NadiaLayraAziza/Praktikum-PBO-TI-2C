package Exercise_1;

abstract class Pegawai {
    protected String nama;
    protected int gaji;
    
    public Pegawai(){
        
    }
    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    abstract public int getGaji();
    
}
