import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaration of variable
        int gallonGas = 0;
        int price = 0;
        int mpg = 0;
        double costFor100 = 0;
        int distance = 0;
        String trash = "";
        //create new scanner
        Scanner in = new Scanner(System.in);
        //ask user to input variables
        System.out.println("enter the number of gallons of gas in the tank:");
        if (in.hasNextInt()) {
            gallonGas = in.nextInt();
            in.nextLine();// clear the buffer
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for gallon of gas: " + " " + trash);
        }
        System.out.println("enter the fuel efficiency in miles per gallon:");
        if (in.hasNextInt()) {
            mpg = in.nextInt();
            in.nextLine();// clear the buffer
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for fuel of gas: " + " " + trash);
        }

        System.out.println("enter the price of gas per gallon:");
        if (in.hasNextInt()) {
            price = in.nextInt();
            in.nextLine();// clear the buffer
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for price of gas: " + " " + trash);
        }
        //calculation cost for 100
        costFor100 = (100/mpg)*price;
        System.out.println("the cost per 100 miles is: " + costFor100);
        distance = gallonGas / mpg;
        System.out.println("the gas in the tank can go is: " + distance+ " "+"miles");
    }
}