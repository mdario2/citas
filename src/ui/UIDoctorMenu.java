/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author mdari
 */
public class UIDoctorMenu {
    
    public static ArrayList<Doctor> doctorsAvailables = new ArrayList<>();
    
    public static void showDoctorMenu(){
        int response=0;
        do {            
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UIMenu.doctorLoggeed.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My scheduled appointment");
            System.out.println("0. Logout");
            
            Scanner sc  = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response!=0);
    }
    
    private static void showAddAvailableApoitments(){
        int response =0;
        do {            
            System.out.println();
            System.out.println("::Add available appointment");
            System.out.println(":: Select a Month");
            for (int i = 0; i < 3; i++) {
                int j=i+1;
                System.out.println(j+". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            if(response >0 && response <4){
                //1.2.3
                int monthSelected = response;
                System.out.println(monthSelected+". "+UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Your date is: "+date+"\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;
                
                int responseTime=0;
                String time ="";
                do {                    
                    System.out.println("Insert the Time available for date: "+date+"[16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: "+time+"\n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());
                    
                } while (responseTime == 2);
                
                UIMenu.doctorLoggeed.addAvailableAppointment(date, time);
                checkDoctorAvailables(UIMenu.doctorLoggeed);
                
            }else if(response == 0){
                showDoctorMenu();
            }
        } while (response!=0);
    }
    
    private static void checkDoctorAvailables(Doctor doctor){
        if(doctor.getAvailableApointmens().size() > 0 
                && !doctorsAvailables.contains(doctor)){
            doctorsAvailables.add(doctor);
        }
    }
}
