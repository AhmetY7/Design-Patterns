package design.patterns.creational.builder;

public class Main {
    /*
    * Builder Parttern kısaca karmaşık veya çok sayıda variable'ı olan nesneleri adım adım oluşturmamızı sağlar.
    * */
    public static void main(String[] args) {
        printHouse(HouseBuilder.builder()
                .setCity("sfa")
                .setBathRoomNumber(5)
                .setDateOfBuilding(5)
                .setDublex(false)
                .setDistrict("dafafas")
                .setToiletNumber(2)
                .build());

        // Ön koşullu olarak garajı olan bir ev build ettik.
        printHouse(HouseBuilder.hasGarageBuilder()
                .setCity("sfa")
                .setBathRoomNumber(5)
                .setDateOfBuilding(5)
                .setDublex(false)
                .setDistrict("dafafas")
                .setToiletNumber(2)
                .build());
    }

    private static void printHouse(House house) {
        System.out.println(house);
    }
}
