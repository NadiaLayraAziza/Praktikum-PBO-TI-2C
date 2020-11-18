package Exercise_2;

public class TelevisiJadul extends Elektronik {
    private String modelInput;
    
    public TelevisiJadul(){
        
    }
    public String getModelInput(){
        modelInput = "DVI";
        System.out.println("Nyalakan televisi jadul dengan input: " + modelInput);
        return modelInput;
    }
}
