package Tugas.Overloading;

public class Main_Overloading {
    
    public static void main(String[] args){
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut dengan 1 Atribut = " + s.totalSudut(90));
        System.out.println("Total Sudut dengan 2 Atribut = " + s.totalSudut(90, 180));
        System.out.println("Keliling dengan 3 sisi = " + s.keliling(12, 7, 4));
        System.out.println("Keliling dengan 2 sisi = " + s.keliling(15, 8));
    }
}
