public class GasolineCar extends AFuelCar{

    GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model,numberOfDoors, kmPrLitre);
    }


    @Override
    public String getFuelType(){
        return "Gasoline";
    }
    public int getRegistrationFee() {
        if( 20 <= kmPrLitre &&  kmPrLitre < 50){
            return  330;
        }
        else if(15 <= kmPrLitre &&  kmPrLitre < 20){
            return 1050;
        }
        else if(10 <= kmPrLitre &&  kmPrLitre < 15){
            return 2340;
        }
        else if(5 <= kmPrLitre &&  kmPrLitre < 10){
            return 5500;
        }
        else if(0 <= kmPrLitre &&  kmPrLitre < 5){
            return 10470;
        }
        else {
            System.out.println("Out of range for kmPrLitre");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "registrationNumber: "+registrationNumber+"\n"+"make: "+make+"\n"+"model: "+model+"\n"+"numberOfDoors: "+numberOfDoors+"\n"+"kmPrLitre: "+kmPrLitre+"\n";
    }
}
