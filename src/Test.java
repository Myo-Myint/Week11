import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        MathsUtils mathsUtils = new MathsUtils();
        Scanner input = new Scanner(System.in);
        int a = 5;
        int b = 6;

        //factorial
        System.out.println("Put the number to calculate factorial:");
        int input_num = input.nextInt();
        int fact = mathsUtils.calculateFact(input_num);
        System.out.println("Factorial of "+ input_num+" is " + fact);

        //swapping
        mathsUtils.swap();

        //areas
        int aot = mathsUtils.areaOfTriangle(a,b);
        System.out.println("Area of triangle is "+ aot);
        int aor = mathsUtils.areaOfRectangle(a,b);
        System.out.println("Area of rectangle is "+ aor);
        int aos = mathsUtils.areaOfSquare(a);
        System.out.println("Area of square is "+ aos);

    }
}
