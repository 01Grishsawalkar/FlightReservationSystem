package PRJCT1;

import java.util.Scanner;


public class Address {
    String city;
    String state;
    String country;
    String street_area;
    int pin_code;
    protected String departure;
    protected String arrival;
    String FlightClass;
    String FlightDate;
    int choice;
    String name;
    void show4() {
      //  ArrayList Data = new ArrayList();
        Scanner avi = new Scanner(System.in);





//        Scanner avi = new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        name = avi.nextLine();
        System.out.println("Enter Your Street Area:");
        street_area = avi.nextLine();
        System.out.println("Enter Your Pin_Code:");
        pin_code = avi.nextInt();
        System.out.println("Enter city");
        city = avi.next();
        System.out.println("Enter State");
        state = avi.next();
        System.out.println("Enter Your Country");
        country = avi.next();

        System.out.println("Registration Successful");

        System.out.println("Enter Departure Location");
        setDeparture(avi.next());
        System.out.println("Enter Arrival Location");
        setArrival(avi.next());
        System.out.println("Enter Flight Ticket Type(Regular & Tourist)");
        FlightClass = avi.next().toUpperCase();
        System.out.println("Enter Flight Date");
        FlightDate = avi.next();
        System.out.println("Enter Output Preference \n1.Both Fare And Flight Time\n" + " ");
        choice = avi.nextInt();
        System.out.println("Registration Detail"+"\n"+"Name: "+name+"\n"+"Area: "+street_area+"\n"+"pin_code: "+pin_code+"\n"+"City: "+city+"\n"+"state: "+state+"\n"+"country: "+country+"\n");

    }



    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}