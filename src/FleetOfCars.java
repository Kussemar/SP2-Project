import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car>fleet = new ArrayList<>();


    public void addCar(Car car) {
        fleet.add(car);

    }


   public int getTotal(){
   return fleet.size();
    }

    public int getTotalRegistrationFeeForFleet() {
        int sum = 0;
        for (Car car : fleet) {
            sum += car.getRegistrationFee();

        }
        return sum;
    }

    @Override
    public String toString() {
        return "The size of the fleet is " + getTotal() + " large. Total registration fee for the fleet is: "+getTotalRegistrationFeeForFleet();
    }

}
