package com.kodilla.good.patterns.flight;

public class FlightRelation {

        private String departureAirport;
        private String arrivalAirport;

        public FlightRelation(String departureAirport, String arrivalAirport) {
                this.departureAirport = departureAirport;
                this.arrivalAirport = arrivalAirport;
        }

        public String getDepartureAirport() {
                return departureAirport;
        }

        public String getArrivalAirport() {
                return arrivalAirport;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                FlightRelation that = (FlightRelation) o;

                if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
                        return false;
                return arrivalAirport != null ? arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport == null;
        }

        @Override
        public int hashCode() {
                int result = departureAirport != null ? departureAirport.hashCode() : 0;
                result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
                return result;
        }


}
