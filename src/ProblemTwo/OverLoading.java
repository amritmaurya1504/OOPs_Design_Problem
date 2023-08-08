package ProblemTwo;

public class OverLoading {
    public static int add(int a, int b){
        return a + b;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static int add(int a , int b, int c, int d){
        return a + b + c + d;
    }
    public static void main(String[] args) {
        System.out.println(add(12,45));
        System.out.println(add(1.2,45.5));
        System.out.println(add(12,4, 5,2));
    }
}
