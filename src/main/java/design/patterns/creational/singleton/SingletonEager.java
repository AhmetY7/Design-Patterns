package design.patterns.creational.singleton;

public class SingletonEager {
    /*
    * Buradaki singleton tasarım kalıbı ile bu singleton nesnesi kullanılsın ya da kullanılmasın 1 tane
    * singleton nesnesi mutlaka oluşturulacak. Bu şekilde kullanılmasını beklemeden oluşturulan nesnelere
    * eager loading denir. Bu ise büyük projelerde farklı problemlere neden olabilir.
    * */

    private static final SingletonEager singleton = new SingletonEager();

    private static int count = 0;

    private SingletonEager() {
        System.out.println("SingletonEager oluşturuldu.");
    }

    public static SingletonEager getSingleton() {
        count++;
        System.out.println("SingletonEager called " + count + " times and reference of instance " + singleton);
        return singleton;
    }
}
