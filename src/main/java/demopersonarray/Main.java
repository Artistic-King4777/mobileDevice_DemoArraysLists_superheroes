package demopersonarray;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Person one = new Person("Dwayne Rose");

        Person two = new Person("Zee");

        Person three = new Person("Jarvis/Jermaine");

        Person four = new Person("Jokkul N. Frostii");

        Person five = new Person("Claudius");

        Person six = new Person("iZay");

        Person seven = new Person("Manny");

        ArrayList<Person> classmates = new ArrayList<>();
        classmates.add(one);
        classmates.add(two);
        classmates.add(three);
        classmates.add(four);
        classmates.add(five);
        classmates.add(six);
        classmates.add(seven);

        Iterator<Person> classroom = classmates.iterator();
        while(classroom.hasNext()){
            Person result = classroom.next();
            System.out.println(result);
        }








    /*
    make a person class
    String name
    constructor
    getter and setter
    toString Method
    make person objects within ArrayList
    loop through and print out each person
    */



    /*
TODAYS DATE: 4/10/2018:
Homework
• Google Hashmaps in java and read up on it
//• Make an ArrayList of Superhero objects and use the Iterator to loop and print out their superpowers
//• Also use an iterator to print out their Flightspeed
• Read from page 273 -  353
• Repl is due at 60% by Next Tuesday

 */




    }
}
