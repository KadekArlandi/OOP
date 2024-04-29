/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;
import java.util.Scanner;
/**
 *
 * @author LAB F
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        System.out.println("Nilai Alas :");
        float nAlas = dIN.nextFloat();
        System.out.println("Nilai Tinggi : ");        
        float nTinggi = dIN.nextFloat();
        
        LuasSegi3 LS = new LuasSegi3(nAlas, nTinggi);
        
        //LS.setALAS(54);
        //LS.setTINGGI(70);
        LS.HLuasSegi3();
        
        System.out.println("HITUNG LUAS SEGITIGA");
        System.out.println("====================");
        System.out.println("");
        System.out.println("");
        System.out.println("NILAI ALAS : "+LS.getALAS());
        System.out.println("NILAI TINGGI : "+LS.getTINGGI());
        System.out.println("Jadi luas segitiga : ");
        System.out.println("Luas = ½ x Alas x Tinggi");
        System.out.println("     = ½ x "+LS.getALAS()+" x "+LS.getTINGGI());
        System.out.println("     = "+LS.getLUAS());
    }
    
}
