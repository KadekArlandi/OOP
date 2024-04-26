/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Lab E
 */
public class Mahasiswa {
    String nim, nama;
    
    void setNim(String vnim){
        nim = vnim;
    }
    
    void setNama(String vnama){
        nama = vnama;
    }
    
    String getNim(){
        return nim;
    }
    
    String getNama(){
        return nama;
    }
    
    void TampilHasl(){
        System.out.println("Nama saya adalah : "+getNama());
        System.out.println("Nim saya adalah : "+getNim());
    }
    
    
}
