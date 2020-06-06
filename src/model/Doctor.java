/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void addAvailableAppointment(String date, String time){
        
        
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

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Nefrologia");
    }
    
    
    
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(time);
            } catch (ParseException ex) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        public String getDate(String date) {
            return format.format(date);
        
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
