package abstractSuperheroes;

import java.util.Arrays;

public abstract class SuperHero {

    private String realName;        //realN
    private String[] specialPowers; //specialP

    abstract String[] listPowers();



    public SuperHero(String realN, String[] specialP){
        this.realName = realN;
        this.specialPowers = specialP;
    }



    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String[] getSpecialPowers() {
        return specialPowers;
    }





    @Override
    public String toString() {
        return  realName +
                " possesses these powers: " + Arrays.toString(specialPowers) + "\n";
                //"=======================================================================================================================";
    }

    public void setSpecialPowers(String[] specialPowers) {
        this.specialPowers = specialPowers;


    }



}
