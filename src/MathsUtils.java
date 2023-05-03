import java.util.Scanner;

public class MathsUtils {

    public int calculateFact(int input_num){
        int answer = 1;
        for (int i = 1; i <= input_num ; i++) {
            answer = answer*i;
        }
        return answer;
    }

    public void swap(){
        System.out.println("Enter the value of x and y");
        Scanner input = new Scanner(System.in);
        /*Define variables*/
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("before swapping numbers: "+x +" "+ y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: "+x +"  " + y);
    }

    public int areaOfTriangle(int base, int height){
        return (base*height) / 2;
    }

    public int areaOfRectangle(int width, int height){
        return width*height;
    }

    public double areaOfCircle(int radius){
        return radius*radius*Math.PI;
    }

    public int areaOfSquare(int side){
        return side*side;
    }
}
