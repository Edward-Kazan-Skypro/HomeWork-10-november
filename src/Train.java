public class Train extends Transport{

    private double travelCost;
    private double travelTime;
    private String startStation;
    private String finishStation;
    private int numberOfWagons;

    public Train(String brand, String model, String productionCountry, int productionYear) {
        super(brand, model, productionCountry, productionYear);
    }


    public double getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(double travelCost) {
        this.travelCost = travelCost;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Поезд " + super.getBrand() +
                ", модель " + super.getModel() +
                ", год выпуска " + super.getProductionYear() +
                ", страна производства " + super.getProductionCountry() +
                ", скорость передвижения - " + super.getMaxSpeed() + "км/ч" +
                ", маршрут движения - от " + startStation + " до " + finishStation + ".\n" +
                "Цена поездки - " + travelCost + " рублей," +
                "в поезде " + numberOfWagons + " вагонов.";
    }
}
