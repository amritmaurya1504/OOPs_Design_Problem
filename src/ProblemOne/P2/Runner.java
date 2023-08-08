package ProblemOne.P2;

import ProblemOne.P1.Triangle;

class Equilateral extends Triangle {

    public Equilateral(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("I am " + name);
    }
}

public class Runner {
    public static void main(String[] args) {
        Equilateral eq = new Equilateral("Hey I am Equilateral");
        eq.printName();
    }
}
