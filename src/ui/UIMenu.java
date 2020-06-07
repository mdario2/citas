/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;
import static ui.UIDoctorMenu.showDoctorMenu;

/**
 *
 * @author mdari
 */
public class UIMenu {
    
    public static final String[] MONTHS  = {"January","February","March","April","May","June",
                                            "Julay","August"};
    public static Doctor doctorLoggeed;
    public static Patient patientLoggeed;
    
    
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response=0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+". "+MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
    
    public static void authUser(int userType){
        //userType =1 Doctor
        //userType = 2 Patient
        
        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("Alejandro Villa", "alejo@mail.com"));
        doctores.add(new Doctor("Karen Sosa", "kasosa@mail.com"));
        doctores.add(new Doctor("Rocio Gomez", "rociog@mail.com"));
        
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Berenice Zapata", "berenjena@mail.com"));
        patients.add(new Patient("Roberto Rodriguez", "robert22@mail.com"));
        patients.add(new Patient("Carlos Sanchez", "carlitos@mail.com"));
        
        boolean emailCorrect = false;
        
        do{
            System.out.println("Insert your email: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType ==1){
                for (Doctor doc : doctores) {
                    if(doc.getEmail().equals(email)){
                        emailCorrect=true;
                        //Obtener el usuario loggeado
                        doctorLoggeed = doc;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if(userType ==2){
                for (Patient pac : patients) {
                    if(pac.getEmail().equals(email)){
                        emailCorrect=true;
                        //Obtener el usuario loggeado
                        patientLoggeed = pac;
                        showPatientMenu();
                    }
                }
            }
            
        }while(!emailCorrect);
    }
}
