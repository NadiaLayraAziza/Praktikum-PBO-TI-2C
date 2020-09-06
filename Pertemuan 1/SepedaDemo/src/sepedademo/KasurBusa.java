package sepedademo;

public class KasurBusa extends Kasur
{
    private String tingkatKelembutan;
    private int kepadatanBusa;
   
   public void setTingkatKelembutan(String newValue)
   {
       tingkatKelembutan = newValue;
   }
   public void setKepadatan(int newValue)
   {
       kepadatanBusa = newValue;
   }
   public void cetakStatus()
   {
       System.out.println();
       System.out.println("            BUSA             ");
       super.cetakStatus();
       System.out.println("Tingkat Kelembutan: " + tingkatKelembutan);
       System.out.println("Kepadatan busa: " + kepadatanBusa);
   }
}
