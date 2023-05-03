import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int item_id;
    public static String item_description, user_decision;
    public static double item_price;
    public static int year, month, day;
    public static boolean status = true;
    public static ArrayList<HeadphonePrototype> headphone_list = new ArrayList<>();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Gson gson = new Gson();


        while(status){
            System.out.print("Please insert an Item ID: ");
            item_id = input.nextInt();
            System.out.print("Please enter an Item description: ");
            item_description = input.next();
            System.out.print("Please enter the Item price: ");
            item_price = input.nextDouble();
            System.out.print("Please enter the year of Manufacture: ");
            year = input.nextInt();
            System.out.print("Please enter the month of Manufacture: ");
            month = input.nextInt();
            System.out.print("Please enter the day of Manufacture: ");
            day = input.nextInt();
            LocalDate dom = LocalDate.of(year, month, day);
            LocalDate doe = LocalDate.of(year + 10, month, day);

            HeadphonePrototype first_headphone = new HeadphonePrototype(item_id, item_price, doe, dom,item_description);
            headphone_list.add(first_headphone);

            System.out.println("Would you like to add another headphone? Yes or No ");
            user_decision = input.next();

            status = user_decision.equalsIgnoreCase("yes");

        }


//        Iterator<HeadphonePrototype> iterator = headphone_list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().getItem_description());
//        }


        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter());
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        String json = gson.toJson(headphone_list);
        System.out.println(json);

    }
}
