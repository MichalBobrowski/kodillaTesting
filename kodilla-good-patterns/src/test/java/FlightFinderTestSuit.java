import com.kodilla.good.patterns.flight.FlightBase;
import com.kodilla.good.patterns.flight.FlightFinder;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FlightFinderTestSuit {

    @Test
    public void searchFlightFromNormal(){
        //given
        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        List<String> expetingList = new ArrayList<>();
        expetingList.add("Berlin");
        expetingList.add("Brasil");


        List<String> operationalTestList = new ArrayList<>();

        //when
        operationalTestList = flightFinder.searchFlightFrom(flightBase, "Madryt");

        //then
        Assert.assertEquals(operationalTestList, expetingList);
    }

    @Test
    public void searchFlightFromEmpty() {

        //given
        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<String> operationalTestList = flightFinder.searchFlightFrom(flightBase, "Radom");

        //then
        Assert.assertTrue(operationalTestList.isEmpty());
    }

    @Test
    public void searchFlightToTestNormal(){
        //given
        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        List<String> expetingList = new ArrayList<>();
        expetingList.add("Madryt");

        //when
        List<String> operationalTestList = flightFinder.searchFlightFrom(flightBase, "Brasil");


        //then
        Assert.assertEquals(operationalTestList, expetingList);
    }

    @Test
    public void searchFlightToTestEmpty() {

        //given
        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<String> operationalTestList = flightFinder.searchFlightTo(flightBase, "Radom");

        //then
        Assert.assertTrue(operationalTestList.isEmpty());
    }

    @Test
    public void searchFlightTestNormal() {
        //given
        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        List<String> expetingList = new ArrayList<>();
        expetingList.add("Berlin");

        //when
        List<String> operationalTestList = flightFinder.searchFlight(flightBase, "Warszawa", "Madryt");

        //then
        Assert.assertEquals(operationalTestList, expetingList);
    }

    @Test
    public void searchFlightTestNoResult() {
        //given
        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        List<String> expetingList = new ArrayList<>();

        //when
        List<String> operationalTestList = flightFinder.searchFlight(flightBase, "Radom", "Ustrzyki");

        //then
        Assert.assertTrue(operationalTestList.isEmpty());
    }

}
