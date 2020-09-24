package tugas;

public class Novel {
    private String judul;
    private String genre;
    private Buku buku;
    
    Novel(){
        
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    public Buku getBuku(){
        return buku;
    }
    public String info(){
        String info = "";
        info += "Judul: " + judul + "\n";
        info += "Genre: " + genre + "\n";
        info += "Info Buku: " + buku.info() + "\n";
        return info;
    }
}
