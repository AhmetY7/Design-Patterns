package design.patterns.creational.abstractfactory;

public interface PhoneFactory {

    Phone getPhone(String model, String battery, int width, int height);
}
