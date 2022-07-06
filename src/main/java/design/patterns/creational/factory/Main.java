package design.patterns.creational.factory;

public class Main {
    /*
    * Bu pattern nesnleri oluşturma görevi görür. Adı üstünde factory.
    * Nesneyi oluşturma görevini factory'e bırakıyoruz.
    * Kısacası nesneyi newleme işlemini Factory classımıza vericez.
    *
    * Burada bir telefon örneği yapacağız. Diyelim ki iki modelimiz var s8 ve note8 diye.
    * Bunları newlerken kendimiz newlemeyeceğiz de istenilen telefonun özelliklerine göre
    * factory sınıfımız bize telefonun instancesini dönecek.
    * */
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "5000mah", 5, 10);
        Phone note8 = PhoneFactory.getPhone("note8", "8000mah", 20, 30);

        System.out.println("S8 Phone: " + s8);
        System.out.println("Note8 Phone: " + note8);
    }
}
