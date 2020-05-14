import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {

    public String name;
    public String Address;
    public String SquareFeet;
    public String HasUsedBooks;
    public Integer StoreSize;
    private ArrayList<String> titles;

    public Bookstore() {
    }

    public Bookstore(String name, String Address, Integer StoreSize, String HasUsedBooks) {
        this.name = name;
        this.Address = Address;
        this.HasUsedBooks = HasUsedBooks;
        this.StoreSize = StoreSize;
        titles = new ArrayList<String>();
        loadTitles();

    }

    public void title1() {
        for (String i : titles) {
            System.out.println(i);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getHasUsedBooks() {
        return HasUsedBooks;
    }

    public Integer getSize() {
        return StoreSize;
    }

    public void printDetails() {
        System.out.println("StoreName     :    " + name + "\n Address    : " + Address + " \n HasUsedBooks  : "
                + HasUsedBooks + "\n Store size   :  " + StoreSize + "SqFt");
        // System.out.println("StoreHours : ");
    }

    public String openHours(String day) {
        if ((day.equalsIgnoreCase("Saturday")) || (day.equalsIgnoreCase("Sunday"))) {
            System.out.println("Store is closed.");
        } else if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Store is open from 9am to 7pm.");
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Store is open from 9am to 7pm.");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Store is open from 9am to 7pm.");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Store is open from 9am to 7pm.");
        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("Store is open from 9am to 7pm.");
        }
        return "";
    }

    private void loadTitles() {
        try {
            util.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }
}
