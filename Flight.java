package PRJCT1;

    public class Flight extends Address{
        private String Flight_name;
        private String Flight_NO;
        public String arrival;
        public String Departure;

        String getFlight_name(){
            return Flight_name;
        }
        public void setFlight_name(String Flight_name){
            this.Flight_name=Flight_name;
        }

        String getFlight_NO(){
            return Flight_NO;
        }
        public void setFlight_NO(String Flight_NO){
            this.Flight_NO=Flight_NO;
        }
        public String getArrival(){
            return arrival;
        }
        public void setArrival(String arrival){
            this.arrival=arrival;
        }

        public String getDeparture(){
            return Departure;
        }
        public void setDeparture(String Departure){
            this. Departure= Departure;
        }
    }


