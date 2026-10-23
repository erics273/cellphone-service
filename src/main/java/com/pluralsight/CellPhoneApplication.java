package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        //create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        //ask the question
        System.out.print("What is the serial number?");
        //store the answer
        int serialNumber = input.nextInt();
        //set the serial number on the phone
        newPhoneWhoDis.setSerialNumber(serialNumber);

        //ask the question
        System.out.print("What model is the phone?");
        String model = input.nextLine();
        newPhoneWhoDis.setModel(model);
        
        newPhoneWhoDis.setCarrier(
                askQuestion(input, "Who is the carrier?")
        );

        newPhoneWhoDis.setOwner(
                askQuestion(input, "Who is the owner of the phone?")
        );

        newPhoneWhoDis.setPhoneNumber(
                askQuestion(input, "What is the phone number?")
        );

        //eric cheating by generating the toString method on the class
       // System.out.println(newPhoneWhoDis.toString());

        //use our display method to display the information about the  phone
        display(newPhoneWhoDis);
        display(newPhoneWhoDis);

        //test my cellphone dial method
        newPhoneWhoDis.dial("817-937-3870");

        //create the new phone
        CellPhone newCellphonePart2 = new CellPhone();

        //set the serial on newCellphonePart2
        newCellphonePart2.setSerialNumber(6767);
        //set the model of this cellphone
        newCellphonePart2.setModel("Nokia");
        newCellphonePart2.setCarrier("verizon");
        newCellphonePart2.setOwner("Mark");
        newCellphonePart2.setPhoneNumber("676-767-6767");

        //have newPhoneWhoDis call newCellphonePart2
        newPhoneWhoDis.dial(newCellphonePart2.getPhoneNumber());

        newCellphonePart2.dial(newPhoneWhoDis.getPhoneNumber());


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
