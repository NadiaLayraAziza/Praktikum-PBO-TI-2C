package sepedademo;

public class KasurSpringBad extends Kasur
{
   private String jenisPegas;
   private String padding;
   
   public void setJenisPegas(String newValue)
   {
       jenisPegas = newValue;
   }
   public void setPadding(String newValue)
   {
       padding = newValue;
   }
   public void cetakStatus()
   {
       System.out.println();
       System.out.println("          SPRING BAD          ");
       super.cetakStatus();
       System.out.println("Jenis Pegas: " + jenisPegas);
       System.out.println("Jenis Padding: " + padding);
   }
}
