/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan07;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 * 06-05-2024
 */
public class induk {
    private String nama;
    
    public induk(String nm, int nl){
        nama = nm;
        nilai = nl;
    }
    
    public int nilai;
    
    public void setNama(String nVal){
        this.nama = nVal;
    }
    
    public void setNama(){
        this.nama = "Nama saya Arlandi";
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void cetakNama(){
        System.out.printf("Isi variabel nama : %S \nDengan tinggi berat badan %d \n",this.nama,this.nilai);
    }
}
