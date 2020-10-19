package uts_1_pbo;

public class SepedaMotor extends Mesin {
    public Mesin mesin;
    private String merekMotor;
    
    SepedaMotor(String merekMotor, String mesin){
        this.merekMotor = merekMotor;
        super.merek = mesin;
    }
    public void setMerekMotor (String merekMotor){
        this.merekMotor = merekMotor;
    }
    public String getMerekMotor(){
        return merekMotor;
    }
    public String getMerekMesin(){
        return super.getMerek();
    }
    public void tambahKecepatanMotor(){
        super.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        super.kurangiKecepatan();
        
    }
    
}
