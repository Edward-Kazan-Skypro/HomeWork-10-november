public class Transport {

    private final String brand;
    private final String model;
    private final String productionCountry;
    private final int productionYear;

    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, String productionCountry, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



}
