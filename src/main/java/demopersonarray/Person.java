package demopersonarray;

public class Person {

    //instance variable
    private String name;

    //constructor
    public Person(String name){
        this.name = name;
    }


    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    //toString


//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "My Classmates: " +
                " names are " + name;
    }



}
