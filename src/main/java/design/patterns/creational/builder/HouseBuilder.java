package design.patterns.creational.builder;

public class HouseBuilder {

    private String city;
    private String district;

    private int dateOfBuilding;
    private int roomNumber;
    private int bathRoomNumber;
    private int toiletNumber;

    private boolean isDublex;
    private boolean hasGarage;
    private boolean hasAirConditioner;

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public static HouseBuilder hasGarageBuilder() {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.setHasGarage(true);
        return houseBuilder;
    }

    public House build() {
        House house = new House();

        house.setCity(city);
        house.setDateOfBuilding(dateOfBuilding);
        house.setDistrict(district);
        house.setDublex(isDublex);
        house.setBathRoomNumber(bathRoomNumber);
        house.setHasGarage(hasGarage);
        house.setRoomNumber(roomNumber);
        house.setToiletNumber(toiletNumber);
        house.setHasAirConditioner(hasAirConditioner);

        return house;
    }

    public HouseBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HouseBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public HouseBuilder setDateOfBuilding(int dateOfBuilding) {
        this.dateOfBuilding = dateOfBuilding;
        return this;
    }

    public HouseBuilder setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public HouseBuilder setBathRoomNumber(int bathRoomNumber) {
        this.bathRoomNumber = bathRoomNumber;
        return this;
    }

    public HouseBuilder setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
        return this;
    }

    public HouseBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        return this;
    }
}
