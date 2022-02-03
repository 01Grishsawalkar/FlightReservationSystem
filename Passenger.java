package PRJCT1;
import java.util.Scanner;

    public class Passenger extends Flight{
        public static String Name;
        public static String AadharCard_No;
        String getName(){
            return Name;
        }
        public void setName(String Name){
            this.Name=Name;
        }
        void show1(){
//        System.out.println("enter Your full name");
            Scanner avi=new Scanner(System.in);
//        Name=avi.nextLine();
            System.out.println("Enter Your AadharCard_No");
            AadharCard_No=avi.nextLine();
//        System.out.println("Registration Detail"+"\n"+"Name: "+name+"\n"+"Area: "+street_area+"\n"+"pin_code: "+pin_code+"\n"+"City: "+city+"\n"+"state: "+state+"\n"+"country: "+country+"\n");
//        System.out.println("Passenger Mobile_NO: "+Mobile_NO+"\n"+"Passenger email_ID: "+email_id);

            System.out.println("\n"+"Passenger Id_NO: "+AadharCard_No);

        }

    }
