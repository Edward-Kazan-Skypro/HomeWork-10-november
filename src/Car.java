import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car extends Transport {

    private String bodyType = "default";
    private int numberOfSeats = 4;

    //Изменяемые поля
    double engineVolume = 1.5;
    String transmission = "default";
    String regNumber = "x000xx000";
    String winterTires = "winter tyres";


    //Поля внутренних классов
    Car.Key key;
    Car.Insurance insurance;


    public Car(String brand, String model, String productionCountry, int productionYear, String bodyType, int numberOfSeats, String fuelType) {
        super(brand, model, productionCountry, productionYear, fuelType);
        if (checkInputString(bodyType)) {
            this.bodyType = bodyType;
        }
        if (numberOfSeats > 0) this.numberOfSeats = numberOfSeats;
    }

    public void refill() {
        System.out.print("Автомобиль " + getBrand() + " " + getModel() + " заправлен ");
        if (super.getFuelType().equals("бензин")) {
            System.out.println("бензином.");
        }
        if (super.getFuelType().equals("дизель")) {
            System.out.println("дизельным топливом.");
        }
        if (super.getFuelType().equals("электро")) {
            System.out.println(" - батареи подзаряжены.");
        }
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
        if (numberOfSeats > 0) this.numberOfSeats = numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (checkInputString(transmission)) this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (checkInputString(regNumber) & regNumber.length() == 9) {
            this.regNumber = regNumber;
        }
    }

    public String getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(String winterTires) {
        if (checkInputString(winterTires)) {
            this.winterTires = winterTires;
        }
    }

    public void seasonalTireChange(String season) {
        if (season.equals("winter") || season.equals("summer")) {
            if (season.equalsIgnoreCase("winter")) {
                setWinterTires("winter tyres");
            }
            if (season.equalsIgnoreCase("summer")) {
                setWinterTires("summer tyres");
            }
        }
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Car.Key inputKey) {
        key = inputKey;
    }

    public void setInsurance(Car.Insurance inputInsurance) {
        insurance = inputInsurance;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", объем двигателя - " + engineVolume + " л.,\n" +
                "коробка передач: " + transmission +
                ", тип кузова: " + bodyType + ",\n" +
                "регистрационный номер: " + regNumber +
                ", количество мест: " + numberOfSeats +
                ", тип покрышек: " + winterTires + "\n" +
                "удаленный запуск двигателя: " + key.getRemoteEngineStart() +
                ", бесключевой доступ: " + key.getKeylessEntry() + "\n" +
                "срок действия страховки до: " + insurance.getDuration() + " года" +
                ", стоимость страховки: " + insurance.getCost() +
                ", номер страхового полиса/договора: " + insurance.getNumber();
    }

    public class Key {
        private String remoteEngineStart = "нет";
        private String keylessEntry = "нет";

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        public Key(String remoteEngineStart, String keylessEntry) {
            if (checkInputString(remoteEngineStart)) this.remoteEngineStart = remoteEngineStart;
            if (checkInputString(keylessEntry)) this.keylessEntry = keylessEntry;
        }
    }

    public class Insurance {

        private String duration = "01.01.1990";
        private double cost = 0;
        private int number = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        public Insurance(String duration, double cost, int number) {
            if (cost > 0) this.cost = cost;
            String numberAsString = String.valueOf(number);
            if (numberAsString.length() == 9) {
                this.number = number;
            } else {
                System.out.println("Неверно указан номер страховки!");
                System.out.println("Номер страховки не изменен, осталось значение по умолчанию.");
                System.out.println();
            }
            LocalDate dateFromInputDuration = LocalDate.parse(duration, formatter);
            if (dateFromInputDuration.isAfter(LocalDate.now())) this.duration = duration;
        }

        public void checkDuration(Car car) {
            LocalDate localDate = LocalDate.now();
            LocalDate dateFromInsurance = LocalDate.parse(Car.Insurance.this.getDuration(), formatter);
            if (dateFromInsurance.isBefore(localDate)) {
                System.out.println("Срока действия страховки истек!");
                System.out.println("Пожалуйста, продлите Вашу страховую защиту.");
            }
        }

        public String getDuration() {
            return duration;
        }

        public double getCost() {
            return cost;
        }

        public int getNumber() {
            return number;
        }
    }
}
