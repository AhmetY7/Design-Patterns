package design.patterns.creational.abstractfactory;

public class Main {
    /*
    * Factory patterndeki oluşacak nesnelerden çok sayıda olduğu zaman if else yapısı çok karmaşık hale gelebilir.
    * Bu nedenle abstract factory pattern ortaya çıkmıştır.
    * Abstract factory ne yapıyor peki ? factory patternde yaptığımız Phone örneğini ele alırsak
    * Bizim PhoneFactory sınıfımızı s8 ve note8 factory olarak ikiye bölüyor.
    * s8 fabrikası sadece s8, note8 fabrikası ise sadece note8 üretiyor.
    * Nesne üretilmek istendiği zaman s8 isteniyorsa s8factory, note8 isteniyorsa note8factory ilgili nesneyi oluşturuyor
    * */
    public static void main(String[] args) {
        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("s8", "2600mah", 5, 20);

        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("note8", "5000mah", 10, 22);

        System.out.println("S8 Phone: " + s8);
        System.out.println("Note8 Phone: " + note8);
    }
}
