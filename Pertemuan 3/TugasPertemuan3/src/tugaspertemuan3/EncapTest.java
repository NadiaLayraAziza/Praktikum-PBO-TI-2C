package tugaspertemuan3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        EncapDemo encap1 = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        
        encap.setName("James");
        encap.setAge(35);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        
        encap1.setName("Nadia");
        encap1.setAge(15);
        
        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());
        
        encap2.setName("Layra");
        encap2.setAge(22);
        
        System.out.println("\nName : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
    }
}
