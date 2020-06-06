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
import model.User;
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
        myDoctor.addAvailableAppointment("02/02/2018", "10 a.m");
        myDoctor.addAvailableAppointment("30/09/2020", "1 p.m");
        myDoctor.addAvailableAppointment("12/05/2014", "4 p.m");
        
        
        Patient p1= new Patient("Esther", "rosa@mail.com");
       // System.out.println(myDoctor);
        
        User user1 = new Doctor("Pedrito Pereira", "pello@junior.com");
        user1.showDataUser();
        System.out.println("-------------");
        User u2 = new Patient("Evaluna", "eva@gmail.com");
        u2.showDataUser();
    }
    
   
}
