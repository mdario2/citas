/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.Doctor;

/**
 *
 * @author mdari
 */
public class UIPatientMenu {
    
    public static void showPatientMenu(){
        int response =0;
        do {            
            System.out.println("\n\n");
            System.out.println("Welcome: "+UIMenu.patientLoggeed);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointmens");
            System.out.println("0. logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response){
                case 1:
                    
                    break;
                    
            }
        } while (response!=0);
    }
    
    private static void showBookAppointmentMenu(){
        int response =0;
        do {            
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            
            Map<Integer,Map<Integer,Doctor>> doctors = new TreeMap<>();
            for (int i = 0; i < UIDoctorMenu.doctorsAvailables.size(); i++) {
                
            }
        } while (response!=0);
        
    }
}
