/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mdari
 */
public class Doctor extends User {
     
     private String speciality;

  
    public Doctor(String name, String email) {

        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
     
    
    ArrayList<AvailableAppointment> aA = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        aA.add(new AvailableAppointment(date, time));
    }
    
    public ArrayList<AvailableAppointment> getAvailableApointmens(){
        for (AvailableAppointment availableAppointment : aA) {
            System.out.println(availableAppointment.getDate()+" "+ availableAppointment.getTime());
        }
        return aA;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpeciality: "+speciality+"\nAvailable: "+aA.toString();
    }
    
    
    
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointment \nDate: "+date+"\nTime: "+time;
        }
        
        
        
        
    }
}
