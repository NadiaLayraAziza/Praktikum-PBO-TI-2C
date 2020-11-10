package tugas;

public class MainTugas {
    
    public static void main(String[] args) {
        
        Keledai kd = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla go = new Gorilla("Gulali", 4, "Haum Haum", "Hitam Manis");
        Singa si = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        
        kd.displayMakan();
        kd.displayBinatang();
        kd.displayData();
        
        go.displayMakan();
        go.displayBinatang();
        go.displayData();
        
        si.displayMakan();
        si.displayBinatang();
        si.displayData();
        
    }
}
