/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 */
public class HitungLuasSegitiga {
    double Alas, Tinggi, Luas;
    double HitungLuasSegi3;
    
    void SetAlas(double nilai){
        Alas = nilai;
    }
    
    void SetTinggi(double nilai){
        Tinggi = nilai;
    }
    
    double GetAlas(){
        return Alas;
    }
    
    double GetTinggi(){
        return Tinggi;
    }
    
    double HitungLuasSegi3(){
        double hsl = (Alas*Tinggi)/2;
        return hsl;
    }
    
    void TampilHasil(){
        System.out.println("HITUNG LUAS SEGITIGA");
        System.out.println("====================");
        System.out.print("NIlai Alas   : "+Alas);
        System.out.println("Nilai Tinggi : "+Tinggi);
        System.out.println("Nilai Luas   : ");
        System.out.println("Luas = (Alas*TInggi)/2");
        System.out.println("     = ("+Alas+"*"+Tinggi+")/2");
        System.out.println("     ="+Luas);
    }
}
