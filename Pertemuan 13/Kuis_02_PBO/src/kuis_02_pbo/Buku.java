package kuis_02_pbo;

public class Buku extends MediaInformasi{
    
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
        System.out.println("\nBuku ini memiliki: " + jml);
        System.out.println("\nJika dihitung dengan covernya, maka jumlah halaman dari buku tersebut: "
                + (jml + 4) + " halaman, \nlebih tebal daropada majalah karena terdapat cover dalam dan cover luar");
    }
    @Override
    public void reputasi(){
        System.out.println("\nPenerbit Buku ini bereputasi!");
    }
    
}
