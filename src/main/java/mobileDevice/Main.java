package mobileDevice;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MobileDevice tabletOne = new Tablet("Google", "Samsung Galaxy Note S3", "Android Popcorn",
                499.99, .65, 9.7,  new String[]{"Chrome, Youtube, Google Play"});



        MobileDevice tabletTwo = new Tablet("Apple", "iPad Pro", "iOS", 1248.00, .65, 12.9,
                new String[]{"iTunes, ibisPaint X, Fortnight Mobile"});



        MobileDevice[] tablets = new MobileDevice[]{tabletOne, tabletTwo};
        for(MobileDevice tablet : tablets){
            System.out.print("\n" + "Device: " + tablet.getDevice() + "\n" + "\n" + "Top Apps: " + tablet.listMyApps() + "\n" +
                    "The price after discount is: " + tablet.calculateDiscount() + "\n");
        }


        System.out.println("\n" + "==================== ARRAY LIST AND ITERATOR CODE BELOW THIS LINE ===================" + "\n");
        ArrayList<MobileDevice> mobile = new ArrayList<>();
        mobile.add(tabletOne);
        mobile.add(tabletTwo);

        Iterator<MobileDevice> devices = mobile.iterator();
        while(devices.hasNext()){
            MobileDevice result = devices.next();
            System.out.println("Device: " + result.getDevice() + "\n" + "The Top Apps are: " + result.listMyApps() +
                    "\n" + "The price of " + result.getDevice() + " after discount is: $" + result.calculateDiscount() + "\n");
        }


//        //google ArrayList<Integer> = new ArrayList();
//        //ArrayList<E>
//        int x, y;
//        x = 5;
//        ArrayList<Integer> box = new ArrayList<Integer>();
//        box.add(x);
//
//        y = box.get(0);
//        System.out.println(y);




    }
}
