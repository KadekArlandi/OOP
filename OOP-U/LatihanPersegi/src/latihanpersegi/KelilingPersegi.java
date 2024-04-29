/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpersegi;

/**
 *
 * @author LAB F
 */
public class KelilingPersegi {
    private float sisi, keliling;
    
    public KelilingPersegi(float SS){
        sisi = SS;
    }
    
    public void setSISI(float nVAL){
        this.sisi = nVAL;
    }
    
    public float getSISI(){
        return sisi;
    }
        
    public void HKelilingPersegi(){
        keliling = 4*sisi;
    }
    
    public float getKELILING(){
        return keliling;        
    }
}
