package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        //create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        newPhoneWhoDis.setSerialNumber(
                Integer.parseInt(askQuestion(input, "What is the serial number?"))
        );


        newPhoneWhoDis.setModel(
                askQuestion(input, "What model is the phone?")
        );

        newPhoneWhoDis.setCarrier(
                askQuestion(input, "Who is the carrier?")
        );

        newPhoneWhoDis.setOwner(
                askQuestion(input, "What is the phone number?")
        );

        newPhoneWhoDis.setPhoneNumber(
                askQuestion(input, "Who is the owner of the phone?")
        );

        //eric cheating by generating the toString method on the class
       // System.out.println(newPhoneWhoDis.toString());

        //use our display method to display the information about the  phone
        display(newPhoneWhoDis);
        display(newPhoneWhoDis);


    }

    public static String askQuestion(Scanner scanner, String question){

        System.out.print(question + ": ");
        return scanner.nextLine().trim();

    }

    public static void display( CellPhone somePhone ){
        //the way the instructions want it using the getters
        System.out.println("Serial Number: " + somePhone.getSerialNumber());
        System.out.println("Model: " + somePhone.getModel());
        System.out.println("Carrier: " + somePhone.getCarrier());
        System.out.println("Owner: " + somePhone.getOwner());
        System.out.println("Phone Number: " + somePhone.getPhoneNumber());
    }

}
