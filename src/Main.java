public class Main {
    public static void main(String[] args) {
        //Задание - Car
        Car ladaGranta = new Car("Lada", "Granta", "Россия",2015, "седан", 4, "бензин");
        ladaGranta.setColor("синий");
        ladaGranta.setTransmission("механика");
        ladaGranta.setRegNumber("У023ВВ999");
        ladaGranta.setWinterTires("summer tyres");
        //Здесь меняем тип шин
        ladaGranta.seasonalTireChange("winter");
        //Добавим поля "ключ" и "страховка"
        //Если этого не сделать, то будет ошибка NPE при просмотре информации по объекту,
        //т.к. в методе toString идет обращение к полям объекта Key (то же и с Insurance).
        Car.Key keyForLadaGranta = ladaGranta.new Key ("нет", "есть");
        ladaGranta.setKey(keyForLadaGranta);
        Car.Insurance insuranceForLadaGranta = ladaGranta.new Insurance ("01.01.2023", 46000.45, 666666666);
        ladaGranta.setInsurance (insuranceForLadaGranta);
        System.out.println(ladaGranta);
        System.out.println();

        Car electromobile = new Car("Tesla", "Revolution", "США",2021, "седан", 2, "электро");
        electromobile.setColor("белый");
        electromobile.setTransmission("автомат");
        electromobile.setRegNumber("А000АА000");
        electromobile.setWinterTires("winter tyres");
        Car.Key keyForElectromobile = electromobile.new Key ("есть", "есть");
        electromobile.setKey(keyForElectromobile);
        Car.Insurance insuranceForElectromobile = electromobile.new Insurance ("12.12.2024", 99000.15, 111111111);
        electromobile.setInsurance (insuranceForElectromobile);
        System.out.println(electromobile);
        System.out.println();

       //Заправка автомобиля Lada Granta
        ladaGranta.refill();
        //Заправка автомобиля электромобиля
        electromobile.refill();
        System.out.println("----------------------------------------------------------------------");

        //Задание - Train
        System.out.println("Выполнение задания - сведения по поездам:");
        Train Ласточка = new Train("Ласточка","B-901", "Россия", 2011, "дизель");
        Ласточка.setTravelTime(301);
        Ласточка.setTravelCost(3500);
        Ласточка.setNumberOfWagons(11);
        Ласточка.setStartStation("Белорусский вокзал");
        Ласточка.setFinishStation("станция Минск-Пассажирский");
        Ласточка.setMaxSpeed(301);
        System.out.println(Ласточка);
        System.out.println();

        Train Ленинград = new Train("Ленинград","D-125", "Россия", 2019, "дизель");
        Ленинград.setTravelTime(270);
        Ленинград.setTravelCost(1700);
        Ленинград.setNumberOfWagons(8);
        Ленинград.setStartStation("Ленинградский вокзал");
        Ленинград.setFinishStation("станция Ленинград-Пассажирский");
        Ленинград.setMaxSpeed(270);
        System.out.println(Ленинград);
        System.out.println();
        //Заправка поезда Ласточка
        Ласточка.refill();
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        //Задание - Bus
        System.out.println("Выполнение задания - сведения по автобусам:");
        Bus ikarus = new Bus("Ikarus", "V-345", "Болгария", 2011, "Дизель");
        ikarus.setColor("черный");
        System.out.println(ikarus);

        Bus higer = new Bus("HIGER", "X-999", "Китай", 2020, "бензин");
        higer.setColor("белый");
        System.out.println(higer);
        System.out.println();

        Bus hyundai = new Bus("HYUNDAI", "A-555", "Китай", 2015, "дизель");
        hyundai.setColor("желтый");
        System.out.println(hyundai);
        System.out.println();
        //Заправка автобуса HIGER
        higer.refill();
        //Заправка автобуса HYUNDAI
        hyundai.refill();
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        //Проверим работу методов hashCode() и equals()
        Bus bus_1 = new Bus("HYUNDAI", "A-555", "Китай", 2015, "дизель");
        Bus bus_2 = new Bus("HYUNDAI", "A-555", "Китай", 2015, "дизель");
        System.out.println("bus_1 equals bus_2 ? - " + bus_1.equals(bus_2));
        System.out.println("bus_1.hashCode() = " + bus_1.hashCode());
        System.out.println("bus_2.hashCode() = " + bus_2.hashCode());
        System.out.println("----------------------------------------------------------------------");
    }
}