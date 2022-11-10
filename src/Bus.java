public class Bus extends Transport{

    public Bus(String brand, String model, String productionCountry, int productionYear, String fuelType) {
        super(brand, model, productionCountry, productionYear, fuelType);
    }

    @Override
    public void refill() {
        System.out.print("Автобус " + getBrand() + " " + getModel() + " заправлен ");
        if (super.getFuelType().equals("бензин")) {
            System.out.println("бензином.");
        }
        if (super.getFuelType().equals("дизель")) {
            System.out.println("дизельным топливом.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
