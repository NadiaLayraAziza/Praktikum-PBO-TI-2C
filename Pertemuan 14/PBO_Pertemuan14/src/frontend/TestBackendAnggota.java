package frontend;

import backend.*;

public class TestBackendAnggota {
    public static void main(String[] args){
        Anggota ang1 = new Anggota("Nadia", "Pasuruan", "081234489551");
        Anggota ang2 = new Anggota("Layra", "Malang", "081234796909");
        Anggota ang3 = new Anggota("Aziza", "Probolinggo", "081259347608");

        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        // test update
        ang2.setAlamat("Jakarta");
        ang2.save();

        // test delete
        ang3.delete();

        // test select all
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: " + a.getTelepon());
        }

        // test search
        for(Anggota a : new Anggota().search("Jakarta")){
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: " + a.getTelepon());
        }
    }
}
