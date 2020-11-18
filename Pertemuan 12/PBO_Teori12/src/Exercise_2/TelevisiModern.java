package Exercise_2;

public class TelevisiModern extends Elektronik{
    private String modelInput;
    
    public TelevisiModern(){
        
    }
    public String getModelInput(){
        modelInput = "HDMI";
        System.out.println("Nyalakan televisi modern dengan input: " + modelInput);
        return modelInput;
    }
}
