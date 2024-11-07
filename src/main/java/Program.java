import app.models.Calculator;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4 , 6));
        System.out.println(calculator.subtract(10 , 5));
        System.out.println(calculator.multiply(2 , 3));
        System.out.println(calculator.divide(10 , 2));


    }
}