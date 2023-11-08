import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car c){
        fleet.add(c);
    }

    @Override
    public String toString(){
        String str = "-------------------------------\n";
        for (Car c : fleet) {
            str+=c.toString();
            str+="-------------------------------\n";

        }

        return str;
    }

    public int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for (Car c : fleet) {
            sum+=c.getRegistrationFee();
        }
        return sum;
    }


}
