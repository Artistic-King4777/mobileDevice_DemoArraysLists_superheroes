package demoList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
    public static void main(String[] args) {

//        //google ArrayList<Integer> = new ArrayList();
//        //ArrayList<E>
//        int x, y;
//        x = 5;
//        ArrayList<Integer> box = new ArrayList<Integer>();
//        box.add(x);
//
//        y = box.get(0);
//        System.out.println(y);




        //google ArrayList<Integer> = new ArrayList();
        //ArrayList<E>





//
//        //ONE //boolean  - add(E e)
//        ArrayList<String>fruits = new ArrayList<>();
//        fruits.add("Dragon Fruit");
//        System.out.println(fruits);
//        System.out.println("======================");
//
//
//        //TWO //void  - add (index, E element)
//        fruits.add(0, "Star Fruits");
//        System.out.println(fruits);
//        System.out.println("=========================");
//
//
//        //THREE
//        ArrayList<String>fruitsTwo = new ArrayList<>();
//        fruitsTwo.add("Devil Fruits");
////        System.out.println(fruitsTwo);
//        //--------------------
//        fruits.addAll(fruitsTwo); //guess it prints out
//        //adding fruitsTwo items into fruits Array
//        //System.out.println(fruits);
//
//
//        //FOUR
//        System.out.println("before reset string is: " + fruits);
//        fruits.set(1, "Tomato"); // re-set index 1 to tomato
//        System.out.println("\n" + "after resetting index one its: " + fruits);
//        System.out.println("==============================");
//
//
//        //FIVE
//        System.out.println(fruits.get(2)); //gets what index 2 of the fruits array is
//        //.sort sorts it alphabetically or by least num to greatest
//
//
//        //for loop
//        for(String f : fruits){
//            System.out.println("Using a forEach loop to print array: " + f);
//        }
//        //FRUITS LIST ABOVE


        ArrayList<Integer> myNumbers = new ArrayList<>();
        System.out.println(myNumbers.isEmpty()); // prints out true or false
        myNumbers.add(4);
        myNumbers.add(13);
        myNumbers.add(666);

        for(Integer death : myNumbers){
            System.out.println("Deadly numbers: " + death);
        }


        //iterator list
        System.out.println("Deadly Number Iterator is next: " + "\n");

        Iterator<Integer> deadlyNum = myNumbers.iterator();
        while(deadlyNum.hasNext()){
            Integer result = deadlyNum.next();
            System.out.println(result);
        }







    }
}
