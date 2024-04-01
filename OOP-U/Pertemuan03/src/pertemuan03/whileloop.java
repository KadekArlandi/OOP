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
public class whileloop {
    public static void main(String[] args) {
        int cx = 1;
        int batas = 5;
        
        System.out.println("Perulangan While");
        System.out.println("================");
        while(cx <= batas){
            
            if(cx==3) continue;
            System.out.println("Bilangan ke-"+cx);
            
            
            cx++;
        }
    }
}
