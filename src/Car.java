public class Car extends Transport {

    private String bodyType = "default";
    private int numberOfSeats = 4;

    //Изменяемые поля
    double engineVolume = 1.5;
    String transmission = "default";
    String regNumber = "x000xx000";
    String winterTires = "winter tyres";


    public Car(String brand, String model, String productionCountry, int productionYear, String bodyType, int numberOfSeats) {
        super(brand, model, productionCountry, productionYear);
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(String winterTires) {
        this.winterTires = winterTires;
    }
}
