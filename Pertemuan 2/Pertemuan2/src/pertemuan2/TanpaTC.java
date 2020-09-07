package pertemuan2;

public class TanpaTC {
    public static void main(String[] args) {
        System.out.println("awal prgram");
        
        int x = 10;
        try{
            x = x / 0;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("eror karena pembagian nol");
            System.out.println(x);
            System.out.println("akhir prgram");
        }
    }
}
