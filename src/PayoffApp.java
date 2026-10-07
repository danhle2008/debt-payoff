import java.util.*;
import java.util.Scanner;
import java.util.Collections;
import java.io.*;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard myCard = new CreditCard("Danh", 20.3, 3000);
        CreditCard target = new CreditCard("Red Card", 20.3, 3000);


        myCard.setName("Visa Platinum");
        System.out.println(myCard.getName());
        System.out.println(target.getName());
        
        

        // make an empty arraylist to hold aprs
         List<Double> aprs = new ArrayList<Double>();
        // double[] aprs = new double[5];




        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

        //     // add apr to arrayList
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            System.out.println(card);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        System.out.println(aprs);

        // sort arraylist 
        // print arraylist
    }
}
