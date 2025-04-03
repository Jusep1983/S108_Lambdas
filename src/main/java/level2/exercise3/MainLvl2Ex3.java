package level2.exercise3;

public class MainLvl2Ex3 {
    public static void main(String[] args) {

        Operations addition = (a, b) -> (a + b);
        Operations subtraction = (a, b) -> (a - b);
        Operations multiplication = (a, b) -> (a * b);
        Operations division = (a, b) -> (a / b);

        System.out.println("Addition: " + addition.operation(10.5f, 5.2f));
        System.out.println("Suma: " + subtraction.operation(10.5f, 5.2f));
        System.out.println("Multiplication: " + multiplication.operation(10.5f, 5.2f));
        System.out.println("Division: " + division.operation(10.5f, 5.2f));

    }
}
