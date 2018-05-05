package chapter5;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){};

    // This method of synchronizing Singleton class may take a lot of resources
    // but synchronization is only needed when instance is null
    public static synchronized Singleton getInstance() {
        // This is lazy instantiation as we are creating instance only if needed
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    /*  Method 2
        Double-checked locking: With double-checked locking, we first check to see if an
        instance is created, and if not, THEN we synchronize. This way, we only synchronize
        the first time through, just what we want.
    */
    /*
        public static Singleton getInstance() {
            if(uniqueInstance == null) {
                synchronized (Singleton.class) {
                    if(uniqueInstance == null) {
                        uniqueInstance = new Singleton();
                    }
                }
            }
            return uniqueInstance;
        }
     */

    /*  Method 3
        If your application always creates and uses an instance of the Singleton or the overhead of
        creation and runtime aspects of the Singleton are not onerous, you may want to create your
        Singleton eagerly. Below code is thread-safe.
    */
    /*
        private static Singleton uniqueInstance = new Singleton();
        public static Singleton getInstance() { return uniqueInstance;}
     */

}