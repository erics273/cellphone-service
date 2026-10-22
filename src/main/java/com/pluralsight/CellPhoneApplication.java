package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        //crate the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));
        newPhoneWhoDis.setModel(askQuestion(input, "What model is the phone?"));
        newPhoneWhoDis.setCarrier(askQuestion(input, "Who is the carrier?"));
        newPhoneWhoDis.setOwner(askQuestion(input, "What is the phone number?"));
        newPhoneWhoDis.setPhoneNumber(askQuestion(input, "Who is the owner of the phone?"));

        //eric cheating by generating the toString method on the class
        System.out.println(newPhoneWhoDis.toString());

        //the way the instructions want it using the getters
        System.out.println("Serial Number: " + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model: " + newPhoneWhoDis.getModel());
        System.out.println("Carrier: " + newPhoneWhoDis.getCarrier());
        System.out.println("Owner: " + newPhoneWhoDis.getOwner());
        System.out.println("Phone Number: " + newPhoneWhoDis.getPhoneNumber());


    }

    public static String askQuestion(Scanner scanner, String question){

        System.out.print(question + ": ");
        return scanner.nextLine().trim();

    }

}
