/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpersegi;

/**
 *
 * @author LAB F
 */
public class LuasPersegi {
    private float sisi, luas;
    
    public LuasPersegi(float SS){
        sisi = SS;
    }
    
    public void setSISI(float nVAL){
        this.sisi = nVAL;
    }
    
    public float getSISI(){
        return sisi;
    }
        
    public void HLuasPersegi(){
        luas = sisi*sisi;
    }
    
    public float getLUAS(){
        return luas;        
    }
}
