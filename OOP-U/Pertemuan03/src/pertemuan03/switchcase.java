/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * NIM : 2201010241
 * 01/04/2024
 */
public class switchcase {
    public static void main(String[] args) {
        String nVal = "Yoga";
        
        switch (nVal) {
            case "Anjas":
                System.out.println("Bill bernama Anjas");
                break;
            case "Aldo":
                System.out.println("Bill bernama Aldo");
                break;
            case "Aldi":
                System.out.println("Bill bernama Aldi");
                break;
            case "Marvin":
                System.out.println("Bill bernama Marvin");                
                break;
            default:
                System.out.println(nVal+" tidak ada dalam definisi");
        }
    }
}
