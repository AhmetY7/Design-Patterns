package design.patterns.creational.singleton;

public class SingletonLazy {
    /*
    * Bu şekilde nesne sadece kullanıldığı zaman oluşan instance'a ise lazy loading denir.
    * */
    private static SingletonLazy singleton;
    private static int count = 0;

    private SingletonLazy() {
        System.out.println("SingletonLazy oluşturuldu.");
    }

    public static SingletonLazy getSingleton() {
        /*
        * Eğer birden fazla thread bu nesnenin instancesini isterse ve ikiside aynı anda singleton'un null
        * olduğu zamanı yakalarsa birden fazla singleton nesnesi oluşabilir. Bunu önlemek için synchronized ile
        * thread-safe hale getirebiliriz. Double check null ile de nesne oluştuktan sonra threadler synchronized'a
        * takılmasını ve singleton null olmadığı halde instancesini alırken yavaşlamasını engelledik.
        * Bu kalıba Double-checked locking denir.
         * */
        if (singleton == null) {
            synchronized (SingletonLazy.class) {
                if (singleton == null) {
                    singleton = new SingletonLazy();
                }
            }

        }
        count++;
        System.out.println("SingletonLazy called " + count + " times and reference of instance " + singleton);

        return singleton;
    }
}
