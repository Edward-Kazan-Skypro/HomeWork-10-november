public class Train extends Transport{

    private int travelCost = 0;
    private double travelTime = 0;
    private String startStation = "не указана";
    private String finishStation = "не указана";
    private int numberOfWagons = 0;

    public Train(String brand, String model, String productionCountry, int productionYear, String fuelType) {
        super(brand, model, productionCountry, productionYear, fuelType);
    }

    @Override
    public void refill() {
        System.out.print("Поезд " + getBrand() + " " + getModel() +
                " заправлен дизельным топливом полностью.");
    }


    public int getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(int travelCost) {
        if (travelCost > 0) this.travelCost = travelCost;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime > 0) this.travelTime = travelTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        if (checkInputString(startStation)) this.startStation = startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        if (checkInputString(finishStation)) this.finishStation = finishStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Поезд " + super.getBrand() +
                ", модель " + super.getModel() +
                ", год выпуска " + super.getProductionYear() +
                ", страна производства " + super.getProductionCountry() +
                ", скорость передвижения - " + super.getMaxSpeed() + " км/ч, " + "тип топлива: " + super.getFuelType() + ",\n" +
                "маршрут движения - от " + startStation + " до " + finishStation + ".\n" +
                "Цена поездки - " + travelCost + " рублей," +
                " в поезде " + numberOfWagons + " вагонов.";
    }
}
