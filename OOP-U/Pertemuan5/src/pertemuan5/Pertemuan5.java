/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 * 26-04-2024
 */
public class Pertemuan5 {
    Aritmatika B = new Aritmatika();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aritmatika Amatik = new Aritmatika();
       int hsltambah = 2;
       hsltambah = Amatik.tambah(3,5);
       System.out.println("Hasil : "+hsltambah);
       HitungLuasSegitiga HLS3 = new HitungLuasSegitiga();
       HLS3.SetAlas(4);
       HLS3.SetTinggi(3);
       double hsl = HLS3.HitungLuasSegi3;
       HLS3.TampilHasil();
    }
    
}
