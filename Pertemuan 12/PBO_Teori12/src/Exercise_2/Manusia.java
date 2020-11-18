package Exercise_2;

public class Manusia {
    
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul){
            ((TelevisiJadul)perangkat).getModelInput();
            ((TelevisiJadul)perangkat).getVoltase();  
        }
        else if(perangkat instanceof TelevisiModern){           
            ((TelevisiModern)perangkat).getModelInput();
            ((TelevisiModern)perangkat).getVoltase();
        }
    }
}
