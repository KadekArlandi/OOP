/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan07;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 * 6 Mei 2024
 */
public class Pertemuan07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk a2 = new induk("ss", 8);
        turunan a1 = new turunan();
        System.out.println("1. Isi Dari Variabel Nama : "+a1.getNama());
        a1.setNama("KADEK ARLANDI MAHESA GAUTAMA PUTRA");
        System.out.println("2. Isi Dari Variabel Nama : "+a1.getNama());
        a1.setNama();
        System.out.println("3. Isi Dari Variabel Nama : "+a1.getNama());
        a1.cetakNama();
        a2.cetakNama();
        
    }
    
}
