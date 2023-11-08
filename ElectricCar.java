public class ElectricCar extends ACar{

    //unit: wh
    private int batteryCapacity;
    //unit: km
    private int maxRange;

    ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber, make, model,numberOfDoors);
        this.batteryCapacity=batteryCapacity;
        this.maxRange=maxRange;
    }

    public int getBatteryCapacityKWh() {

        return batteryCapacity/1000;
    }

    public int getMaxRangeKm() {

        return maxRange;
    }

    public int getWhPrKm(){

        return batteryCapacity/maxRange;
    }

    public int getRegistrationFee() {
        double whPrKmConverted= 100/(getWhPrKm()/91.25);
        if( 20 <= whPrKmConverted &&  whPrKmConverted < 50){
            return  330;
        }
        else if(15 <= whPrKmConverted &&  whPrKmConverted < 20){
            return 1050;
        }
        else if(10 <= whPrKmConverted &&  whPrKmConverted < 15){
            return 2340;
        }
        else if(5 <= whPrKmConverted &&  whPrKmConverted < 10){
            return 5500;
        }
        else if(0 <= whPrKmConverted &&  whPrKmConverted < 5){
            return 10470;
        }
        else {
            System.out.println("Out of range for whPrKm");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "registrationNumber: "+registrationNumber+"\n"+"make: "+make+"\n"+"model: "+model+"\n"+"numberOfDoors: "+numberOfDoors+"\n"+"batteryCapacity: "+batteryCapacity+"\n"+"maxRange: "+maxRange+"\n";
    }


}
