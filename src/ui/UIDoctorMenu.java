/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author mdari
 */
public class UIDoctorMenu {
    
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
            }else if(response == 0){
                showDoctorMenu();
            }
        } while (response!=0);
    }
}
