package pl.coderslab.day1;

abstract class Animal {

    public int noOfLegs;

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public abstract void walk();
}
