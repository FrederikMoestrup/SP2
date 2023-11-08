abstract class AFuelCar extends ACar {
protected int kmPrLitre;

AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
    super(registrationNumber, make, model,numberOfDoors);
    this.kmPrLitre=kmPrLitre;
}


public String getFuelType(){
    return null;
}
public int getKmPrLitre(){
    return kmPrLitre;
}

@Override
 public String toString(){
    return "registrationNumber: "+registrationNumber+"\n"+"make: "+make+"\n"+"model: "+model+"\n"+"numberOfDoors: "+numberOfDoors+"\n"+"kmPrLitre: "+kmPrLitre+"\n";
}


}
