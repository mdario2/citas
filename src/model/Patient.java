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
public class Patient extends User{
   
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email);        
    }

      
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height+" kg";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+"Age: "+birthday+"\n Weight: "+getWeight()+
                "\nBlood: "+blood; 
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historia clinica");
    }
    
    
    
    
}
