import java.util.ArrayList;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Bookstore store1 = new Bookstore("READ", "2431 ade street, charlotte,23456", 1000, "Yes");
        System.out.println("Do u want store details ?");
        String ans1 = scan.next();
        if (ans1.equalsIgnoreCase("Yes")) {
            store1.printDetails();
        } else {
            System.out.println("Ok,Thanks for visiting.");
        }

        System.out.println("What day will u want to visit?");
        String ans = scan.next();
        System.out.println(store1.openHours(ans));
        System.out.println("Do u want list OF Books?  ");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Yes")) {
            store1.title1();
        } else {
            System.out.println("Ok,Thanks.");
        }
        scan.close();
    }

}
