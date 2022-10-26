public class DieselCar extends AFuelCar {

    protected boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public String getFuelType() {
        return "Diesel";
    }



    @Override
    public int getRegistrationFee() {
        if(kmPrLitre > 20) {
            if(!particleFilter){
                return 130+1000;
            }
            return 130;
        }
        if(kmPrLitre > 15 && 20 > kmPrLitre){
            if(!particleFilter){
                return 1390+1000;
            }
            return 1390;
        }
        if(kmPrLitre > 10 && 15 > kmPrLitre){
            if(!particleFilter){
                return 1850+1000;
            }
            return 1850;
        }
        if(kmPrLitre > 5 && 10 > kmPrLitre){
            if(!particleFilter){
                return 2770+1000;
            }
            return 2770;
        }
        else {
            if(!particleFilter){
                return 15260+1000;
            }
            return 15260;
        }
    }


    public boolean hasParticleFilter(){
       return particleFilter;

    }

    @Override
    public String toString() {
        return make + " " + model + ", Fuel type: " + getFuelType() + ". Registation number: " + registrationNumber;
    }
}


