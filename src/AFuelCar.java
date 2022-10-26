public abstract class AFuelCar extends ACar {

    int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int getkmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
    this.kmPrLitre = getkmPrLitre;
    }
  public abstract String getFuelType(); // should return “Gasoline” or “Diesel”



    public int getkmPrLitre() {// should return how many kilometres the car can drive on 1 litre of fuel

       return kmPrLitre;
   }

    @Override
    public String toString() {
        return "AFuelCar{" +
                "getkmPrLitre=" + kmPrLitre +
                '}';
    }
}
