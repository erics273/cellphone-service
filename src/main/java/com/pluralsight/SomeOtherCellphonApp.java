package com.pluralsight;

public class SomeOtherCellphonApp {

    public static void main(String[] args) {

        //create a phone
        CellPhone cellphone1 = new CellPhone();
        //use the setters to make it its own unique thing
        cellphone1.setSerialNumber(12345);
        cellphone1.setModel("Samsung");
        cellphone1.setCarrier("Verizon");
        cellphone1.setPhoneNumber("1234567890");
        cellphone1.setOwner("Jennifer");

        //have jennifer call 800-789-9876
        cellphone1.dial("800-789-9876");
        //make jennifer call 555-987-1234
        cellphone1.dial("555-987-1234");

        CellPhone cellphone2 = new CellPhone();
        cellphone2.setSerialNumber(987654321);
        cellphone2.setModel("Pixel");
        cellphone2.setCarrier("att");
        cellphone2.setPhoneNumber("8675309");
        cellphone2.setOwner("Mark");

        //make mark's phone call jennifer
        cellphone2.dial( cellphone1.getPhoneNumber() );

        CellPhone cellphone3 = new CellPhone();
        cellphone3.setSerialNumber(99999);
        cellphone3.setModel("iphone");
        cellphone3.setCarrier("Boost");
        cellphone3.setPhoneNumber("555-555-5555");
        cellphone3.setOwner("Kimball");

        //use the dial method that take an entire phpone
        cellphone3.dial( cellphone2 );
        cellphone3.dial( cellphone1.getPhoneNumber() );
        cellphone3.dial( cellphone3 );

        CellPhone cellphone4 = new CellPhone("Mint", "Iphone 11", "Bob", "999-999-9999", 12345);

        cellphone4.dial( cellphone3 );


    }

}
