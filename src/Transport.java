import java.time.LocalDate;

public abstract class Transport {
    private String brand = "default";
    private String model = "default";
    private String productionCountry = "default";
    private int productionYear = 2000;
    private String fuelType = "default";

    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, String productionCountry, int productionYear, String fuelType) {
        if (checkInputString(brand)) {
            this.brand = brand;
        }
        if (checkInputString(model)) {
            this.model = model;
        }
        if (productionYear > 0 && productionYear < LocalDate.now().getYear()) {
            this.productionYear = productionYear;
        }
        if (checkInputString(productionCountry)) {
            this.productionCountry = productionCountry;
        }
        if (checkInputString(fuelType)) {
            if (fuelType.equalsIgnoreCase("бензин")){this.fuelType = "бензин";}
            if (fuelType.equalsIgnoreCase("дизель")){this.fuelType = "дизель";}
            if (fuelType.equalsIgnoreCase("электро")){this.fuelType = "электро";}
        }
    }

    abstract public void refill();

    public String getFuelType() {
        return fuelType;
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
        if (checkInputString(color)) {this.color = color;} else {this.color = "default";}
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }

    public boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }

    @Override
    public String toString() {
        return "Информация по транспортному средству - " + brand + " " + model + "\n" +
                "марка: " + brand +
                ", модель: " + model + ", " +
                productionYear + " год выпуска" +
                ", сборка: " + productionCountry +
                ", цвет: " + color +
                ", тип топлива: " + fuelType;
    }
}
