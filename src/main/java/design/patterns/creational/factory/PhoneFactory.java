package design.patterns.creational.factory;

public class PhoneFactory {
    public static Phone getPhone(String model, String battery, int width, int height) {

        Phone phone;
        // Not: Bu telefon modellerinden 100 tane de olabilirdi bu nedenle if else artık içinden çıkılmaz hal
        // alacağı için abstract factory method ortaya çıkmış.
        if ("S8".equalsIgnoreCase(model)) {
            phone = new S8(model, battery, width, height);
        } else if ("Note8".equalsIgnoreCase(model)) {
            phone = new Note8(model, battery, width, height);
        } else {
            throw new RuntimeException("Not a valid model!");
        }

        return phone;
    }
}
