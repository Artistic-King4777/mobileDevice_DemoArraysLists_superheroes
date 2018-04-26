package abstractSuperheroes;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        SpiderMan underoos = new SpiderMan("Peter Parker",  new String[]{"Spidey Sense, Wall Crawling, Web Shooters, Superhuman Flexibility and, Healing Factor"});

        Falcon sam = new Falcon("Sam Wilson", new String[]{"Master Aerialist, Master Acrobat, Flight, Cybernetic Implants, Skilled Shield Fighter"});

        Deadpool wade = new Deadpool("Wade Wilson", new String[]{"EXTREME Healing Factor, Immortality, Superhuman Stamina, Skilled Swordsman, Resistance to Drugs/Poisons"});

        DannyPhantom danny = new DannyPhantom("Danny Fenton", new String[]{"Ghostly Abilities, Ghostly Wail, Ghost Sense, Cryokinesis, Going Ghost"});


//
//        SuperHero[] supers = new SuperHero[]{underoos, sam, wade, danny};
//        for(SuperHero su : supers){
//            //System.out.println("\n" + su.getRealName() + " possesses these powers: " + su.listPowers() + "\n");
//            System.out.println(su.toString());
//        }
//
//
//        System.out.print("Danny Phantom flies over " + danny.flightSpeed() + "mph!" + "\n" + "\n");
//
//        System.out.println("==============================================================");
//        System.out.println("\n" + "Falcon flies around " + sam.flightSpeed() + "mph!" + "\n");
//        System.out.println(sam.flightSpeed());
//        System.out.println("=============================================================");
//        System.out.println(sam.myBlackHero() + "! He can fly at speeds up to " + sam.flightSpeed() + "mph, Wow!");
//
//
//        IFlightSpeed[] flight = new IFlightSpeed[]{underoos, sam, danny};
//        for(IFlightSpeed hero : flight){
//            System.out.println(hero);
//        }






        ArrayList<SuperHero> superheroes = new ArrayList<>();
        superheroes.add(underoos);
        superheroes.add(wade);
        superheroes.add(sam);
        superheroes.add(danny);

        Iterator<SuperHero> heroes = superheroes.iterator();
        while(heroes.hasNext()){
            SuperHero result = heroes.next();
            System.out.println(result);
        }
        //its using the toString?? howw??


        System.out.println("==============================" + "iFlightSpeed below this line!!!: "
                + "=====================================================================" +
                "\n" + "\n");


        ArrayList<IFlightSpeed> flyFast = new ArrayList<>();
        flyFast.add(underoos);
        flyFast.add(sam);
        flyFast.add(danny);


        Iterator<IFlightSpeed> flying = flyFast.iterator();
        while(flying.hasNext()){
            IFlightSpeed result = flying.next();
            System.out.println(result.toString() + "Their flight speeds can go up to, or over:  " + result.flightSpeed() + " mph!!" + "\n" + "\n");
        }

            //+ "\n" + "Their flightSpeeds are: "


/*

Homework
• Google Hashmaps in java and read up on it
//• Make an ArrayList of Superhero objects and use the Iterator to loop and print out their superpowers
//• Also use an iterator to print out their Flightspeed
• Read from page 273 -  353
• Repl is due at 60% by Next Tuesday

 */

        //end of psvm
    }

    //end of main
}
