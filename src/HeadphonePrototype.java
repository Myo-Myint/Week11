import java.time.LocalDate;

public class HeadphonePrototype {
    private final int item_id;
    private final LocalDate expiry_date;
    private final LocalDate manufactured_date;
    private final double item_price;
    private final String item_description;



    public HeadphonePrototype(int item_id, double item_price, LocalDate expiry_date, LocalDate manufactured_date, String item_description){
        this.item_id = item_id;
        this.item_price = item_price;
        this.expiry_date = expiry_date;
        this.manufactured_date = manufactured_date;
        this.item_description = item_description;
    }


    public int getItem_id() {
        return item_id;
    }

    public LocalDate getExpiry_date() {
        return expiry_date;
    }

    public LocalDate getManufactured_date() {
        return manufactured_date;
    }

    public double getItem_price() {
        return item_price;
    }

    public String getItem_description() {
        return item_description;
    }


}
