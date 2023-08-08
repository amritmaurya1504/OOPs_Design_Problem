package ProblemOne.P1;

public abstract class Triangle {
    protected String name;

    public Triangle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printName();
}
