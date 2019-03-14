import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;

    public void readA() {
        try {
            a = scanner.nextDouble();
        }
        catch(InputMismatchException e) {
            throw new NotNumberExeption("Вводить можно только числа, Введите число!");
        }
    }

    public void readB() {
        try {
            b = scanner.nextDouble();
        }
        catch(InputMismatchException e) {
            throw new NotNumberExeption("Вводить можно только числа, Введите число!");
        }
    }

    public void divide(){
        if (b == 0) {
            throw new RuntimeException("Делить на 0 нельзя");
        }
        System.out.println(a/b);
    }

}