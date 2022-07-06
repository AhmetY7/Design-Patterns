package design.patterns.creational.builder;

public class House {

    private String city;
    private String district;

    private int dateOfBuilding;
    private int roomNumber;
    private int bathRoomNumber;
    private int toiletNumber;

    private boolean isDublex;
    private boolean hasGarage;
    private boolean hasAirConditioner;

    public House() { }

    public House(String city, String district, int dateOfBuilding, int roomNumber, int bathRoomNumber, int toiletNumber, boolean isDublex, boolean hasGarage, boolean hasAirConditioner) {
        this.city = city;
        this.district = district;
        this.dateOfBuilding = dateOfBuilding;
        this.roomNumber = roomNumber;
        this.bathRoomNumber = bathRoomNumber;
        this.toiletNumber = toiletNumber;
        this.isDublex = isDublex;
        this.hasGarage = hasGarage;
        this.hasAirConditioner = hasAirConditioner;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getDateOfBuilding() {
        return dateOfBuilding;
    }

    public void setDateOfBuilding(int dateOfBuilding) {
        this.dateOfBuilding = dateOfBuilding;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBathRoomNumber() {
        return bathRoomNumber;
    }

    public void setBathRoomNumber(int bathRoomNumber) {
        this.bathRoomNumber = bathRoomNumber;
    }

    public int getToiletNumber() {
        return toiletNumber;
    }

    public void setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", dateOfBuilding=" + dateOfBuilding +
                ", roomNumber=" + roomNumber +
                ", bathRoomNumber=" + bathRoomNumber +
                ", toiletNumber=" + toiletNumber +
                ", isDublex=" + isDublex +
                ", hasGarage=" + hasGarage +
                ", hasAirConditioner=" + hasAirConditioner +
                '}';
    }
}
