/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mdari
 */
public class Nurse extends User{
    
    public String especiality;
    
    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }
    
        
}
