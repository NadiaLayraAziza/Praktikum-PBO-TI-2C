package sepedademo;

public class MesinCuci {
    private String merek;
    private int kapasitas;
    private int kecepatan;
    
    public void serMerek(String newValue)
    {
        merek = newValue;
    }
    public void tambahKapasitas(int increment)
    {
        kapasitas = kapasitas + increment;
    }
    public void kurangiKapasitas(int decrement)
    {
        kapasitas = kapasitas - decrement;
    }
    public void tambahKecepatan(int increment)
    {
        kecepatan = kecepatan + increment;
    }
    public void kurangiKecepatan(int decrement)
    {
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatus()
    {
        System.out.println();
        System.out.println("          MESIN CUCI          ");
        System.out.println("==============================");
        System.out.println("Merek: " + merek);
        System.out.println("Kapasitas: " + kapasitas + " Kg");
        System.out.println("Kecepatan:" + kecepatan+ " putaran/menit");
    }
}
