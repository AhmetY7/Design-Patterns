package design.patterns.creational.singleton;

public class Main {
    /*
    * İlgili nesneden projede sadece 1 tane oluşmasını istiyorsak bu patern'i kullanabiliriz.
    * */

    public static void main(String[] args) {
        // 10 kere singleton nesnesi istiyoruz ama bize 1 tane oluşturup hep onu dönecek.
        for (int i = 0; i < 10; i++) {
            SingletonEager singletonEager = SingletonEager.getSingleton();
        }
        for (int i = 0; i < 10; i++) {
            SingletonLazy singletonLazy = SingletonLazy.getSingleton();
        }
    }
}
