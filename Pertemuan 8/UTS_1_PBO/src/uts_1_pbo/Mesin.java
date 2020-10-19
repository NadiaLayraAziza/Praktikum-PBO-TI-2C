package uts_1_pbo;

public class Mesin {
    public String merek;
    private double kecepatan = 0;
    
    Mesin (){
        
    }
    public void setMerek(String merek){
        this.merek = merek;
    }
    public String getMerek(){
        return merek;
    }
    public double getKecepatan(){
        return kecepatan;
    }
    public void tambahKecepatan(){
        if (getMerek().equalsIgnoreCase("honda")) {
            System.out.println("" + (kecepatan += 10) + (" km/h"));            
        } else if (getMerek().equalsIgnoreCase("yamaha")){
            System.out.println("" + (kecepatan += 15) + (" km/h"));            
        }
    }
    public void kurangiKecepatan(){
        if (getMerek().equalsIgnoreCase("honda")) {
            System.out.println("" + (kecepatan -= 5) + (" km/h"));            
        } else if (getMerek().equalsIgnoreCase("yamaha")){
            System.out.println("" + (kecepatan -= 10) + (" km/h"));            
        }
    }
}
