package Exercise_2;

public class Elektronik {
    protected int voltase;
    
    public Elektronik(){
        
    }
    public int getVoltase(){
        voltase = 220;
        System.out.println("Voltase televisi: " + voltase);
        return voltase;
    }
}
