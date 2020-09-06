package sepedademo;

public class LemariBaju {
    private String warna;
    private String bahan;
    private int jumlahBaju;
    
    public void serWarna(String newValue)
    {
        warna = newValue;
    }
    public void serBahan(String newValue)
    {
        bahan = newValue;
    }
    public void tambahbaju(int increment)
    {
        jumlahBaju = jumlahBaju + increment;
    }
    public void kurangiBaju(int decrement)
    {
        jumlahBaju = jumlahBaju - decrement;
    }
    public void cetakStatus()
    {
        System.out.println();
        System.out.println("         LEMARI BAJU          ");
        System.out.println("==============================");
        System.out.println("Warna: " + warna);
        System.out.println("Bahan: " + bahan);
        System.out.println("Jumlah Baju: " + jumlahBaju);
    }
}
