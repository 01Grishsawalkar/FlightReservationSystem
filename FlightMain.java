package PRJCT1;



    public class FlightMain {
        public static void main(String[] args) {
//        RegularTicket avi=new RegularTicket();
            Contact avi=new Contact();
            RegularTicket avi2=new RegularTicket();
            avi2.setPNR_NO("1612441213");
            avi2.setSeat_no("S2/236");
            avi2.setFlight_time("3.22");
            avi2.Ac_Details("not available");
            avi2.setTicketFare(2000);
            Tourist_Ticket avi3=new Tourist_Ticket();
            avi3.setPNR_NO("5523314556");
            avi3.setSeat_no("S4/221");
            avi3.setFlight_time("4.00");
            avi3.Ac_Details("exclusive Available");
            avi3.setTicketFare(5000);
            Passenger avi4=new Passenger();
            avi4.setFlight_name("INDIAN AIRLINE");
            avi4.setFlight_NO("IND,5555");
            avi.setArrival(avi.arrival);
            avi.setDeparture(avi.departure);
            avi.setFlightDate(avi.FlightDate);


            avi.show4();
//        System.out.println();   avi.show0();

            avi.show();
//        Passenger avi5=new Passenger();
            avi4.setName(avi.name);
            avi4.show1();

            System.out.println("Date: "+avi.getFlightDate());
            System.out.println("Passenger Name: "+avi4.getName());
            System.out.println();
            System.out.println("||Flight Detail||");
            System.out.print  ( "\t|\t" +" Flight_Name: "+ avi4.getFlight_name());
            System.out.print  ( "\t|\t" +"Flight_Number: "+ avi4.getFlight_NO());
            System.out.print  ( "\t|\t" +"Arrival: "+ avi.getArrival());
            System.out.println ("\t|\t" +"Departure: "+ avi.getDeparture());
            System.out.println("||REGULAR TICKET||");
            System.out.print  ( "\t|\t" +"PNR_NO: "+ avi2.getPNR_NO());
            System.out.print  ( "\t|\t" +"Seat_NO: "+ avi2.getSeat_no());
            System.out.print  ( "\t|\t" +"Time: "+ avi2.getFlight_time());
            System.out.print  ( "\t|\t" +"AC_Detail: "+ avi2.getAc_Details());
            System.out.println ("\t|\t" +"Fare: "+ avi2.getTicketFare());
            System.out.println();
            System.out.println("||Tourist Ticket||");
            System.out.print  ( "\t|\t" +"PNR_NO: "+ avi3.getPNR_NO());
            System.out.print  ( "\t|\t" +"Seat_NO: "+ avi3.getSeat_no());
            System.out.print  ( "\t|\t" +"Time: "+ avi3.getFlight_time());
            System.out.print  ( "\t|\t" +"AC_Detail: "+ avi3.getAc_Details());
            System.out.print  ( "\t|\t" +"Fare: "+ avi3.getTicketFare());


        }
    }

