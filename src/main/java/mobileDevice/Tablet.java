package mobileDevice;

import java.util.Arrays;

public class Tablet extends MobileDevice {

    private double screenSize;
    private String[] topThreeApps;

    public Tablet(String manufacturer, String device, String os, double cost, double discount, double screenSize, String[] topThreeApps) {
        super(manufacturer, device, os, cost, discount);
        this.screenSize = screenSize;
        this.topThreeApps = topThreeApps;
    }

    @Override
    public String listMyApps() {
        String response = "";
        for (int i = 0; i < topThreeApps.length; i++) {
            response = response + "[ " + topThreeApps[i] + " ]";
        }
        return response;
    }

}