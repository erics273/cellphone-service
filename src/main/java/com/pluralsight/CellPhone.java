package com.pluralsight;

public class CellPhone {

    //private date members (properties)
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //this is the constructor. it has the same name as the class
    public CellPhone() {

        //set the defaults for the properties of this class
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    public CellPhone(String carrier, String model, String owner, String phoneNumber, int serialNumber) {
        this.carrier = carrier;
        this.model = model;
        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.serialNumber = serialNumber;
    }

    //custom methods
    /*
    1)Add a dial(String phoneNumber) method to the CellPhone class that will
    accept a phone number parameter
    2) displays the message "owner's phone is calling (e.g Dana Wyatt's phone is calling 855-555-2222)

     */
    public void dial(String phoneNumber) {
        System.out.println(getOwner() + "'s phone is calling " + phoneNumber);
    }

    //create another dial that takes a CellPhone instead of a String
    public void dial(CellPhone somePhone) {
        System.out.println(getOwner() + "'s phone is calling (" + somePhone.getOwner() + ") " + somePhone.getPhoneNumber());
    }

    //getters and setters
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "carrier='" + carrier + '\'' +
                ", serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
