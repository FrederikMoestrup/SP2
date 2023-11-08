public class Main {
    public static void main(String[] args) {

        //Cars of different type
        GasolineCar Audi = new GasolineCar("123239", "Audi", "A3", 4, 16);
        ElectricCar Tesla = new ElectricCar("245656","Tesla","T6",4,20000,5);
        DieselCar Kia = new DieselCar("396969","Kia","K2", 4, 30,true);

        //Fleet
        FleetOfCars fleet = new FleetOfCars();

        //Add cars to fleet
        fleet.addCar(Audi);
        fleet.addCar(Tesla);
        fleet.addCar(Kia);

        //Prints toString() for each car in fleet
        System.out.println(fleet);

        //Prints total registration fee of cars in fleet
        System.out.println(fleet.getTotalRegistrationFeeForFleet());


    }
}