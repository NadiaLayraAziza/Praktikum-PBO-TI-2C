package sepedademo;

public class Kasur {
    private String merek;
    private int panjang;
    private int lebar;
    private int luas;
    
    public void serMerek(String newValue)
    {
        merek = newValue;
    }
    public void tambahPanjang(int increment)
    {
        panjang = panjang + increment;
    }
    public void kurangiPanjang(int decrement)
    {
        panjang = panjang - decrement;
    }
    public void tambahLebar(int increment)
    {
        lebar = lebar + increment;
    }
    public void kurangiLebar(int decrement)
    {
        lebar = lebar - decrement;
    }
    public void luasKasur()
    {
        luas = panjang * lebar;
    }
    public void cetakStatus()
    {
        System.out.println("            KASUR             ");
        System.out.println("==============================");
        System.out.println("Merek: " + merek);
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Lebar:" + lebar + " cm");
        System.out.println("Luas kasur:" + luas + " cm^2");
        
    }
}
