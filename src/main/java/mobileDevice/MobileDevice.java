package mobileDevice;

public class MobileDevice {

    private String manufacturer;
    private String device;
    protected String operatingSystem; //os
    private double cost;              // price
    private double discount;

    //constructor
    public MobileDevice(String manufacturer, String device, String os, double cost, double discount){
        this.manufacturer = manufacturer;
        this.device = device;
        this.operatingSystem = os;
        this.cost = cost;
        this.discount = discount;
    }



    //methods
    public double calculateDiscount(){
        return cost * discount;
    }







    //getter setter methods

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDevice() {
        return device;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getCost() {
        return cost;
    }

    public String listMyApps(){
        return "";

    }




}
