/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpersegi;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class LatihanPersegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        System.out.println("Nilai Sisi : ");
        float nSisi = dIN.nextFloat();
        
        LuasPersegi LP = new LuasPersegi(nSisi);
        KelilingPersegi KP = new KelilingPersegi(nSisi);
        //LS.setALAS(54);
        //LS.setTINGGI(70);
        LP.HLuasPersegi();
        KP.HKelilingPersegi();
        
        System.out.println("HITUNG LUAS & KELILING PERSEGI");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("LUAS PERSEGI");
        System.out.println("NILAI SISI : "+LP.getSISI());
        System.out.println("Luas = Sisi x Sisi");
        System.out.println("     = "+LP.getSISI()+" x "+LP.getSISI());
        System.out.println("     = "+LP.getLUAS());
        System.out.println("");
        System.out.println("KELILING PERSEGI");
        System.out.println("NILAI SISI : "+KP.getSISI());
        System.out.println("Keliling = 4 x Sisi");
        System.out.println("         = 4 X "+KP.getSISI());
        System.out.println("         = "+KP.getKELILING());
       
    }
    
}
