public class DieselCar extends AFuelCar{


   private boolean particleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){
        super(registrationNumber, make, model,numberOfDoors, kmPrLitre);
        this.particleFilter=particleFilter;
    }


    @Override
    public String getFuelType(){
        return "Diesel";
    }
    public boolean hasParticleFilter(){

        return particleFilter;
    }

    public int getRegistrationFee() {
        int pfFee = 0;
        if(!particleFilter) {
            pfFee = 1000;
        }

            if (20 <= kmPrLitre && kmPrLitre < 50) {
                return 330+130+pfFee;
            } else if (15 <= kmPrLitre && kmPrLitre < 20) {
                return 1050+1390+pfFee;
            } else if (10 <= kmPrLitre && kmPrLitre < 15) {
                return 2340+1850+pfFee;
            } else if (5 <= kmPrLitre && kmPrLitre < 10) {
                return 5500+2770+pfFee;
            } else if (0 <= kmPrLitre && kmPrLitre < 5) {
                return 10470+15260+pfFee;
            } else {
                System.out.println("Out of range for kmPrLitre");
                return 0;
            }


    }

    @Override
    public String toString() {
        return "registrationNumber: "+registrationNumber+"\n"+"make: "+make+"\n"+"model: "+model+"\n"+"numberOfDoors: "+numberOfDoors+"\n"+"kmPrLitre: "+kmPrLitre+"\n"+"particleFilter: "+particleFilter+"\n";
    }

}
