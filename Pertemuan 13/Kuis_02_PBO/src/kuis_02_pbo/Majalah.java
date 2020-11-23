package kuis_02_pbo;

public class Majalah extends MediaInformasi {
    
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
        System.out.println("Majalah ini memiliki: " + jml + " halaman");
        System.out.println("\nJika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut: "
                + (jml + 2) + " halaman");
    }
    @Override
    public void reputasi(){
        System.out.println("\nPenerbit majalah ini bereputasi!");
    }
}
