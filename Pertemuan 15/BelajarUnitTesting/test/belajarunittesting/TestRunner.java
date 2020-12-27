package belajarunittesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

/**
 *
 * @author ACER
 */
public class TestRunner {
    public static void main(String[] args){
        org.junit.runner.Result result = JUnitCore.runClasses(PengolahPesanTest.class);
        
        for(Failure f : result.getFailures()){
            System.out.println(f.toString());
        }
        
        boolean berhasil = result.wasSuccessful();
        System.out.println("Tes berhasil? " + berhasil);
    }
}
