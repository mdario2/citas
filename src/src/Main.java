/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import model.Patient;
import model.Doctor;
import java.util.Date;
import java.util.Scanner;
import ui.UIMenu;
import static ui.UIMenu.*;

/**
 *
 * @author mdari
 */
public class Main {
    
    public static void main(String[] args) {
                
        //showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "pediatria");
        myDoctor.addAvailableAppointment(new Date(), "10 a.m");
        myDoctor.addAvailableAppointment(new Date(), "1 p.m");
        myDoctor.addAvailableAppointment(new Date(), "4 p.m");
        
        
        Patient p1= new Patient("Esther", "rosa@mail.com");
        System.out.println(myDoctor);
        
        
    }
    
   
}
