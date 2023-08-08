package ProblemTwo;
/*
* Question 2: Online Store Products

Design a class structure for an online store system. You need to create a base class called Product,
* with properties like name, price, and category. Subclasses such as Electronics, Clothing, and Books
* should inherit from Product. Implement an interface called Discountable with a method applyDiscount(),
*  and apply it to one of the subclasses. Create a main program to demonstrate polymorphism by
*  calculating and displaying the discounted prices of various products.*/

interface Discountable{
    double applyDiscount(int percentage);
}

class Product{
    String name;
    int price;
    String category;

    public Product(String name, int price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName(){
        return name;
    }
}

class Electronics extends Product implements Discountable{
    public Electronics(String name, int price, String category){
        super(name, price, category);
    }

    @Override
    public double applyDiscount(int percentage) {
        double currPrice = (double) super.price;
        double discountedPrice = (currPrice * percentage ) / 100;
        return currPrice - discountedPrice;
    }
}

class Clothings extends Product{
    public Clothings(String name, int price, String category){
        super(name, price, category);
    }
}

class Books extends Product{
    public Books(String name, int price, String category){
        super(name, price, category);
    }
}

public class Runner {
    public static void main(String[] args) {
        Electronics ece = new Electronics("Macbook", 150000, "Laptop");
        System.out.println(ece.getName());
        System.out.println(ece.applyDiscount(20));
    }
}
