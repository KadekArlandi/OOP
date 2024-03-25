package latihan02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author LAB F
 */
public class Bufferclass {
    public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader (new InputStreamReader(System.in) );
    
        String nama="";
    
        try{
            nama = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi kesalahan saat mengambil data!!");
        }
        System.out.println("Isi variabel nama : "+ nama);
    }
    
}
