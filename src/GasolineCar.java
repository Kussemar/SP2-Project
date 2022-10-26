public class GasolineCar extends AFuelCar {


    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType() {
        return "Gasolin";
    }




    @Override
    public int getRegistrationFee() {
        if(kmPrLitre > 20) {
            return 330;
        }
        if(kmPrLitre > 15 && 20 > kmPrLitre){
            return 1050;
        }
        if(kmPrLitre > 10 && 15 > kmPrLitre){
            return 2340;
        }
        if(kmPrLitre > 5 && 10 > kmPrLitre){
            return 5500;
        }
        else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return make + " " + model + ", Fuel type: " + getFuelType() + ". Registation number: " + registrationNumber;

    }
}
