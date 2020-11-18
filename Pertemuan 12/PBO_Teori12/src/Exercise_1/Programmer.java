package Exercise_1;

public class Programmer extends Pegawai{
    int bonus;
    
    public Programmer(String nama, int gaji, int bonus){
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return gaji;
    }
    
    public int getBonus() {
        return bonus;
    }
}
