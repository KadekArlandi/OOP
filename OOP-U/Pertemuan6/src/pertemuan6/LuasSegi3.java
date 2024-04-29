/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 * 29-04-2024
 */
public class LuasSegi3 {
    private float alas, tinggi, luas;
    
    public LuasSegi3(float AL, float TG){
        alas = AL;
        tinggi = TG;
    }
    
    public void setALAS(float nVAL){
        this.alas = nVAL;
    }
    
    public float getALAS(){
        return alas;
    }
    
    public void setTINGGI(float nVAL){
        this.tinggi = nVAL;
    }
    
    public float getTINGGI(){
        return tinggi;
    }
    
    public void HLuasSegi3(){
        luas = (alas*tinggi)/2;
    }
    
    public float getLUAS(){
        return luas;        
    }
    

}
