import java.util.Random;
import java.util.Scanner;

public class CatchMe {
    public static void main(String[] args) {

        int[] numbers = new int[1000]; //[0][0][0][0][0][0][0] ... 1000
        int target, input;
        int count;
        boolean status = true;
        Scanner in = new Scanner(System.in);

        while (status) {
            System.out.print("Please enter a value to catch: ");
            target = in.nextInt();

            numbers = createArray(numbers);

            count = searchArray(target, numbers);

            System.out.println("The target was found " + count + " times");

            System.out.print("Do you want to guess again? 1 = yes or 0 = no :");
            input = in.nextInt();

            status = input == 1;

        }
    }

    static int[] createArray(int[] num_array){
        Random random = new Random();
        int temp;
        for (int count = 0; count < 1000; count++) {    // add values to the array

            temp = random.nextInt(100);
            num_array[count] = temp;
            //System.out.print(temp + " ");
        }
        return num_array;
    }

    static int searchArray(int target, int[] num_array){
        int count = 0;
        for (int i = 0; i < 1000; i++) {        // check the array for existence of a value

            if (target == num_array[i]) {
                System.out.println("The target Exists in element " + "[" + i + "]");

                count++;
            } else {

                System.out.println("The target does not exist" + "[" + i + "]");
            }

        }
        return count;
    }
}
